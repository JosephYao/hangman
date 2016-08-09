package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanDiscoveredTest {

    private static final String VOWEL_WORD = "a";

    @Test
    public void all_vowel_word() {
        Hangman hangman = new Hangman(VOWEL_WORD);

        assertEquals(VOWEL_WORD, hangman.discovered());
    }
}
