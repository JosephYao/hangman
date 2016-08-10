package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanDiscoveredTest {

    private static final String VOWEL_WORD = "a";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String PLACEHOLDER = "_";
    private static final String TWO_CONSONANT_WORD = "bt";

    @Test
    public void all_vowel_word() {
        assertDiscoveredEquals(VOWEL_WORD, VOWEL_WORD);
    }

    @Test
    public void one_consonant_word() {
        assertDiscoveredEquals(PLACEHOLDER, ONE_CONSONANT_WORD);
    }

    @Test
    public void two_consonant_word() {
        assertDiscoveredEquals(PLACEHOLDER + PLACEHOLDER, TWO_CONSONANT_WORD);
    }

    private void assertDiscoveredEquals(String expected, String word) {
        Hangman hangman = new Hangman(word);

        assertEquals(expected, hangman.discovered());
    }

}
