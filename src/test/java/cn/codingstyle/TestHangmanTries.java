package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    private static final int MAX_TRIES = 12;

    @Test
    public void tries_when_game_start() {
        Hangman hangman = new Hangman("word");

        assertEquals(MAX_TRIES, hangman.tries());
    }
}
