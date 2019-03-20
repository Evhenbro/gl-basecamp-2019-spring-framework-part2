package study.basecamp.service;

import lombok.Setter;

import java.util.Random;

@Setter
public class NumberGenerator {

    private int range = 4;

    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(range);
    }
}
