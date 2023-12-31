package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.domain.service.CadastroEstadoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private CadastroEstadoService cadastroEstadoService;

    @GetMapping
    public List<Estado> listar(){
        return estadoRepository.findAll();
    }

    @GetMapping("/{estadoId}")
    public ResponseEntity<Estado> buscar(@PathVariable Long estadoId){
        Optional<Estado> estado = estadoRepository.findById(estadoId);

        if(estado.isPresent()){
            return ResponseEntity.ok(estado.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> adicionar(@RequestBody Estado estado){
        try{
            estado = cadastroEstadoService.salvar(estado);
            return ResponseEntity.status(HttpStatus.CREATED).body(estado);
        }catch(EntidadeNaoEncontradaException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @PutMapping("/{estadoId}")
    public ResponseEntity<?> atualizar(@PathVariable Long estadoId, @RequestBody Estado estado){
      try{
          Optional<Estado> estadoAtual = estadoRepository.findById(estadoId);

          if(estadoAtual.isPresent()){
              BeanUtils.copyProperties(estado, estadoAtual.get(), "id");

              Estado estadoSalvo = cadastroEstadoService.salvar(estadoAtual.get());
              return ResponseEntity.ok(estadoSalvo);
          }

          return ResponseEntity.notFound().build();

      }catch (EntidadeNaoEncontradaException e){
          return ResponseEntity.badRequest().body(e.getMessage());
      }
    }

    @DeleteMapping("/{estadoId}")
    public ResponseEntity<Estado> remover(@PathVariable Long estadoId){
        try{
            cadastroEstadoService.excluir(estadoId);
            return ResponseEntity.noContent().build();
        }catch(EntidadeEmUsoException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }catch(EntidadeNaoEncontradaException e){
            return ResponseEntity.notFound().build();
        }
    }

}
