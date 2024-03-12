package com.algaworks.algafood.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class RestauranteNaoEncontradaException extends EntidadeNaoEncontradaException{

        private static final long serialVersionUID = 1L;

        public RestauranteNaoEncontradaException(String mensagem){
            super(mensagem);
        }

        public RestauranteNaoEncontradaException(Long restauranteId){
            this(String.format("Não existe um cadastro de Restaurante com o código %d!", restauranteId));
        }
}
