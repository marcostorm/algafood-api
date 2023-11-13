package com.algaworks.algafood;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class NotificacaoConfig {

    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail();

        return notificador;
    }
}
