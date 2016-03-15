package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenGameStart {

    private static final String A_VOWEL_WORD = "a";
    private static final String A_CONSONANT_WORD = "b";
    private static final String PLACEHOLDER = "_";
    private static final String TWO_CONSONANTS_WORD = "yy";

    @Test
    public void discovered_is_itself_when_word_is_a_vowel() {
        Hangman hangman = new Hangman(A_VOWEL_WORD);

        assertEquals(A_VOWEL_WORD, hangman.discovered());
    }

    @Test
    public void discovered_is_placeholder_when_word_is_a_consonant() {
        Hangman hangman = new Hangman(A_CONSONANT_WORD);

        assertEquals(PLACEHOLDER, hangman.discovered());
    }

    @Test
    public void discovered_is_two_placeholders_when_word_is_two_consonants() {
        Hangman hangman = new Hangman(TWO_CONSONANTS_WORD);

        assertEquals(PLACEHOLDER + PLACEHOLDER, hangman.discovered());
    }

}
