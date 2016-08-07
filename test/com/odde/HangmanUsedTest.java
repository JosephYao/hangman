package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanUsedTest {

    private static final String ALL_VOWELS = "aeiou";

    Hangman hangman = new Hangman("word");

    @Test
    public void all_vowels_when_game_just_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void all_vowels_when_type_one_vowel() {
        hangman.type('a');

        assertEquals(ALL_VOWELS, hangman.used());
    }
}
