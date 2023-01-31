package com.jogosfutebolbr.application.http;

import com.jogosfutebolbr.domain.team.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sync")
public class TeamController {

    @GetMapping("/teams")
    public ResponseEntity<Team> load() {
        return ResponseEntity.ok(new Team("olá"));
    }
}
