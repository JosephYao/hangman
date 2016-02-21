package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenGameStart {

    private static final String ONE_VOWEL_WORD = "a";
    private static final String ONE_CONSONANT_WORD = "b";

    @Test
    public void discovered_of_one_vowel_word() {
        Hangman hangman = new Hangman(ONE_VOWEL_WORD);

        assertEquals(ONE_VOWEL_WORD, hangman.discovered());
    }

    @Test
    public void discovered_of_one_consonant_word() {
        Hangman hangman = new Hangman(ONE_CONSONANT_WORD);

        assertEquals("_", hangman.discovered());
    }

    @Test
    public void discovered_of_two_chars_word() {
        Hangman hangman = new Hangman("am");

        assertEquals("a_", hangman.discovered());
    }
}
