package com.jogosfutebolbr.application.http;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sync")
public class SyncController {

    @GetMapping("leagues/br")
    public ResponseEntity<Object> loadLeaguesFromBrazil(){
        return ResponseEntity.ok("olá");
    }
}
