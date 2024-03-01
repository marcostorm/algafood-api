package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CadastroRestauranteService {

    public static final String MSG_RESTAURANTE_NAO_ENCONTRADO = "Não existe um cadastro de Restaurante com o código %d!";
    public static final String MSG_RESTAURANTE_EM_USO = "Restaurante de código %d está sendo utilizado e não pode ser removido";

    @Autowired
    private RestauranteRepository restauranteRepository;

    public Restaurante salvar(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public void excluir(Long restauranteId) {
        try{
            restauranteRepository.deleteById(restauranteId);
        }catch (EntidadeNaoEncontradaException e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(MSG_RESTAURANTE_NAO_ENCONTRADO, restauranteId));
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format(MSG_RESTAURANTE_EM_USO, restauranteId));
        }
    }

    public Restaurante buscarOuFalhar(Long restauranteId){
       return restauranteRepository.findById(restauranteId).
                orElseThrow(() -> new EntidadeNaoEncontradaException(
                        String.format(MSG_RESTAURANTE_NAO_ENCONTRADO, restauranteId)));
    }
}

