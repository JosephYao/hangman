package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanUsedTest {

    private static final String ALL_VOWELS = "aeiou";

    @Test
    public void all_vowels_when_game_just_start() {
        Hangman hangman = new Hangman("word");

        assertEquals(ALL_VOWELS, hangman.used());
    }
}
