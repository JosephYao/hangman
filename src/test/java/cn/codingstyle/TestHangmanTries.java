package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    private static final int MAX_TRIES = 12;
    private static final char VOWEL = 'a';
    private static final char CONTAINED_CONSONANT = 'w';
    private static final char NOT_CONTAINED_CONSONANT = 'b';
    Hangman hangman = new Hangman("word");

    @Test
    public void tries_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_when_type_a_vowel() {
        hangman.type(VOWEL);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_when_type_a_contained_consonant() {
        hangman.type(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_when_type_a_not_contained_consonant() {
        hangman.type(NOT_CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }
}
