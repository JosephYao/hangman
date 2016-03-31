package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.CONTAINED_CONSONANT;
import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    private static final String PLACEHOLDER = "_";
    private static final String ONE_CONSONANT_WORD = "b";
    private static final String TWO_CONSONANTS_WORD = "bt";
    private static final String ONE_VOWEL_WORD = "a";
    private static final String ANOTHER_ONE_VOWEL_WORD = "o";

    @Test
    public void one_consonant_word_when_game_start() {
        assertDiscoveredEquals(PLACEHOLDER, ONE_CONSONANT_WORD);
    }

    @Test
    public void two_consonants_word_when_game_start() {
        assertDiscoveredEquals(PLACEHOLDER + PLACEHOLDER, TWO_CONSONANTS_WORD);
    }

    @Test
    public void one_vowel_word_when_game_start() {
        assertDiscoveredEquals(ONE_VOWEL_WORD, ONE_VOWEL_WORD);
    }

    @Test
    public void another_one_vowel_word_when_game_start() {
        assertDiscoveredEquals(ANOTHER_ONE_VOWEL_WORD, ANOTHER_ONE_VOWEL_WORD);
    }

    @Test
    public void discovered_when_type_a_contained_consonant() {
        HangmanForTest hangman = new HangmanForTest("word");

        hangman.typeWithoutCheckGameOver(CONTAINED_CONSONANT);

        assertEquals(CONTAINED_CONSONANT + "o__", hangman.discovered());
    }

    private void assertDiscoveredEquals(String expectedDiscovered, String word) {
        Hangman hangman = new Hangman(word);

        assertEquals(expectedDiscovered, hangman.discovered());
    }

}
