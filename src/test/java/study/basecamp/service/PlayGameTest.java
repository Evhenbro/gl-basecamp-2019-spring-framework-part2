package study.basecamp.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import study.basecamp.wire.ResponsePlayGame;

import static org.junit.jupiter.api.Assertions.*;

class PlayGameTest {

    @Test
    void startGameIsWin() {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setRange(1);
        PlayGame playGame = new PlayGame();
        playGame.setNumberGenerator(numberGenerator);
        assertEquals(new ResponsePlayGame("You guess " + 0, "you are WINNER"), playGame.startGame(0));
    }

    @Test
    void startGameIsLoose() {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setRange(1);
        PlayGame playGame = new PlayGame();
        playGame.setNumberGenerator(numberGenerator);
        assertNotEquals(new ResponsePlayGame("You guess " + 3, "you are WINNER"), playGame.startGame(0));
    }
}