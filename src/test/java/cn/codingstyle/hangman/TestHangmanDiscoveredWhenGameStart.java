package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenGameStart {

    private static final String PLACEHOLDER = "_";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String TWO_CONSONANTS_WORD = "bm";
    private static final String ONE_VOWEL_WORD = "a";
    private static final String VOWEL = "a";
    private static final String TWO_VOWELS_WORD = "ai";
    private static final String ANOTHER_VOWEL = "i";
    private static final String ONE_VOWEL_AND_ONE_CONSONANT_WORD = "am";

    @Test
    public void a_consonant_word() {
        assertDiscoveredEquals(PLACEHOLDER, ONE_CONSONANT_WORD);
    }

    @Test
    public void two_consonants_word() {
        assertDiscoveredEquals(PLACEHOLDER + PLACEHOLDER, TWO_CONSONANTS_WORD);
    }

    @Test
    public void a_vowel_word() {
        assertDiscoveredEquals(VOWEL, ONE_VOWEL_WORD);
    }

    @Test
    public void two_vowels_word() {
        assertDiscoveredEquals(VOWEL + ANOTHER_VOWEL, TWO_VOWELS_WORD);
    }

    @Test
    public void a_vowel_and_a_consonant_word() {
        assertDiscoveredEquals(VOWEL + PLACEHOLDER, ONE_VOWEL_AND_ONE_CONSONANT_WORD);
    }

    private void assertDiscoveredEquals(String expected, String word) {
        assertEquals(expected, new Hangman(word).discovered());
    }

}
