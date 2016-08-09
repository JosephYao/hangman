package com.odde;

import org.junit.Test;

import static com.odde.TestHelper.*;
import static org.junit.Assert.assertEquals;

public class HangmanTriesTest {

    private static final int MAX_TRIES = 12;
    private static final char CORRECT_CONSONANT = 'w';

    Hangman hangman = new Hangman("word");

    @Test
    public void max_tries_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void reduce_one_when_type_a_vowel() {
        hangman.type(VOWEL);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void max_tries_unchanged_when_type_a_correct_consonant() {
        hangman.type(CORRECT_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }
}
