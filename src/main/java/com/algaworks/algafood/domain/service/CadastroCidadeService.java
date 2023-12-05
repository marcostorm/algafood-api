package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroCidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade salvar(Cidade cidade){
        return cidadeRepository.salvar(cidade);
    }

    public void excluir(Long cidadeId){
        try{
            cidadeRepository.remover(cidadeId);
        }catch(EntidadeNaoEncontradaException e){
            throw new EntidadeNaoEncontradaException(String.format("Não existe um cadastro de cidade com código %d", cidadeId));
        }
    }
}
