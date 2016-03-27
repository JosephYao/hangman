package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenGameStart {

    private static final String PLACEHOLDER = "_";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String TWO_CONSONANTS_WORD = "bc";
    private static final String ONE_VOWEL_WORD = "a";

    @Test
    public void one_consonant_word() {
        Hangman hangman = new Hangman(ONE_CONSONANT_WORD);

        assertEquals(PLACEHOLDER, hangman.discovered());
    }

    @Test
    public void two_consonants_word() {
        Hangman hangman = new Hangman(TWO_CONSONANTS_WORD);

        assertEquals(PLACEHOLDER + PLACEHOLDER, hangman.discovered());
    }

    @Test
    public void one_vowel_word() {
        Hangman hangman = new Hangman(ONE_VOWEL_WORD);

        assertEquals(ONE_VOWEL_WORD, hangman.discovered());
    }
}
