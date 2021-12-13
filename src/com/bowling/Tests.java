package com.bowling;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Tests {

    @Test
    public void AllStrikesExceptStrikeThenSpareLastFrame() {
        var BowlingGame = new Game();
        for (int i=0; i < 10; i++) {
            BowlingGame.roll(10);
        }

        BowlingGame.roll(3);
        BowlingGame.roll(7);

        assertEquals(283, BowlingGame.score());
    }
}
