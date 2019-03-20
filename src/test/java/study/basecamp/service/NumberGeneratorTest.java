package study.basecamp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    NumberGenerator numberGenerator  = new NumberGenerator();

    @Test
    void generateNumberTest() {
        numberGenerator.setRange(2);
        int i = numberGenerator.generateNumber();
        assertEquals(true, i >=0 && i <= 2);
    }
}