package com.park.demo_park_api.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {

    @PostConstruct
    //faz com que o metodo construtor seja executado, apos execução o primeiro metado a ser executado é timezoneConfig
    public void timeZoneConfig() {
        TimeZone.setDefault (TimeZone.getTimeZone ("America/São_Paulo"));

    }
}