package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    private static final String PLACEHOLDER = "_";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String TWO_CONSONANTS_WORD = "bc";
    private static final String ONE_VOWEL_WORD = "a";

    @Test
    public void one_consonant_word_when_game_start() {
        Hangman hangman = new Hangman(ONE_CONSONANT_WORD);

        assertEquals(PLACEHOLDER, hangman.discovered());
    }

    @Test
    public void two_consonants_word_when_game_start() {
        Hangman hangman = new Hangman(TWO_CONSONANTS_WORD);

        assertEquals(PLACEHOLDER + PLACEHOLDER, hangman.discovered());
    }

    @Test
    public void one_vowel_word_when_game_start() {
        Hangman hangman = new Hangman(ONE_VOWEL_WORD);

        assertEquals(ONE_VOWEL_WORD, hangman.discovered());
    }

    @Test
    public void discovered_when_type_a_contained_consonant_char() {
        HangmanForTest hangman = new HangmanForTest("word");

        hangman.typeWithoutCheckGameOver('w');

        assertEquals("wo__", hangman.discovered());
    }
}
