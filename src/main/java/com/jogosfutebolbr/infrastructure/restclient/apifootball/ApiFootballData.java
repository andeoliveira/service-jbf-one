package com.jogosfutebolbr.infrastructure.restclient.apifootball;

import java.util.List;

public record ApiFootballData(
        List<Object> errors,
        String get,
        Object paging,
        List<String> parameters,
        List<String> response,
        Long results
) {}
