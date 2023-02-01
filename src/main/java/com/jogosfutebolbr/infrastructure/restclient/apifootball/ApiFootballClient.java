package com.jogosfutebolbr.infrastructure.restclient.apifootball;

import com.jogosfutebolbr.configuration.ObjectMapperConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value = "${rest.client.api-football.value}",
        url = "${rest.client.api-football.baseUrl}",
        configuration = ObjectMapperConfig.class)
public interface ApiFootballClient {
    @RequestMapping(method = RequestMethod.GET, value = "/teams")
    ResponseEntity<ApiFootballData> teams();

    @RequestMapping(method = RequestMethod.GET, value = "/leagues")
    ResponseEntity<ApiFootballData> leagues();

}
