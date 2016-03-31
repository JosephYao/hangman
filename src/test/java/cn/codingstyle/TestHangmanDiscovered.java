package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    private static final String PLACEHOLDER = "_";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String TWO_CONSONANTS_WORD = "bt";
    private static final String ONE_VOWEL_WORD = "a";
    private static final String ANOTHER_ONE_VOWEL_WORD = "o";
    private static final char CONTAINED_CONSONANT = 'w';

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
    public void another_one_vowel_word_when_game_start() {
        Hangman hangman = new Hangman(ANOTHER_ONE_VOWEL_WORD);

        assertEquals(ANOTHER_ONE_VOWEL_WORD, hangman.discovered());
    }

    @Test
    public void discovered_when_type_a_contained_consonant() {
        HangmanForTest hangman = new HangmanForTest("word");

        hangman.typeWithoutCheckGameOver(CONTAINED_CONSONANT);

        assertEquals(CONTAINED_CONSONANT + "o__", hangman.discovered());
    }
}
