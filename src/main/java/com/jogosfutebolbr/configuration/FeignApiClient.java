package com.jogosfutebolbr.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {"com.jogosfutebolbr.infrastructure.restclient"})
public class FeignApiClient {}
