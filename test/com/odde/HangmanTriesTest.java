package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanTriesTest {

    private static final int MAX_TRIES = 12;

    @Test
    public void max_tries_when_game_start() {
        Hangman hangman = new Hangman("word");

        assertEquals(MAX_TRIES, hangman.tries());
    }
}
