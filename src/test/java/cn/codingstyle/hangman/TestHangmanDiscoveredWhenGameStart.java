package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenGameStart {

    private static final String A_VOWEL_WORD = "a";

    @Test
    public void discovered_is_itself_when_word_is_a_vowel() {
        Hangman hangman = new Hangman(A_VOWEL_WORD);

        assertEquals(A_VOWEL_WORD, hangman.discovered());
    }
}
