package study.basecamp.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.basecamp.wire.ResponsePlayGame;

@Service
@Setter
public class PlayGame {

    @Autowired
    NumberGenerator numberGenerator;


    public ResponsePlayGame startGame(int number) {
        System.out.println((number==numberGenerator.generateNumber()) ? "WIN" : "LOOSE");
        if (number==numberGenerator.generateNumber()) {
            return new ResponsePlayGame("You guess " + number, "you are WINNER");
        }
        return (number==numberGenerator.generateNumber()) ? new ResponsePlayGame("You guess " + number, "you are WINNER") :
                new ResponsePlayGame("You guess " + number, "you are LOOSER");
    }
}
