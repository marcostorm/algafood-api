package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CadastroEstadoService {

    public static final String MSG_ESTADO_NAO_ENCONTRADO = "Não existe um cadastro de Estado com o código %d!";
    public static final String MSG_ESTADO_EM_USO = "Estado de código %d está sendo utilizado e não pode ser removido";

    @Autowired
    private EstadoRepository estadoRepository;

    public Estado salvar(Estado estado){
        return estadoRepository.save(estado);
    }

    public void excluir(Long estadoId){
        try{
            estadoRepository.deleteById(estadoId);
        }catch(EntidadeNaoEncontradaException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(MSG_ESTADO_NAO_ENCONTRADO, estadoId));

        }catch (EntidadeEmUsoException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(MSG_ESTADO_EM_USO, estadoId));
        }
    }

    public Estado buscarOuFalhar(Long estadoId){
        return estadoRepository.findById(estadoId).
                orElseThrow(() -> new EntidadeNaoEncontradaException(
                        String.format(MSG_ESTADO_NAO_ENCONTRADO, estadoId)));

    }

}
