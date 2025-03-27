package com.sarawipay.practica.config;

import com.sarawipay.practica.model.MainTable;
import com.sarawipay.practica.model.Merchant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Merchant merchant() {
        return new Merchant();
    }

    @Bean
    public MainTable mainTable() {
        return new MainTable();
    }
}
