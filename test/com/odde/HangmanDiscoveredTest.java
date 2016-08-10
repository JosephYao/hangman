package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanDiscoveredTest {

    private static final String VOWEL_WORD = "a";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String PLACEHOLDER = "_";

    @Test
    public void all_vowel_word() {
        Hangman hangman = new Hangman(VOWEL_WORD);

        assertEquals(VOWEL_WORD, hangman.discovered());
    }

    @Test
    public void one_consonant_word() {
        Hangman hangman = new Hangman(ONE_CONSONANT_WORD);

        assertEquals(PLACEHOLDER, hangman.discovered());
    }
}
