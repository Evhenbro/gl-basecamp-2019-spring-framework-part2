package study.basecamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import study.basecamp.service.PlayGame;
import study.basecamp.wire.ResponsePlayGame;

@RestController
public class GameController {

    @Autowired
    PlayGame playGame;

    @GetMapping("/{n}")
    public ResponseEntity<ResponsePlayGame> play(@PathVariable int n) {
        return ResponseEntity.ok().body(playGame.startGame(n));
    }
}
