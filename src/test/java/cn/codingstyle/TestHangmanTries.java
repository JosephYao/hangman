package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static cn.codingstyle.HangmanForTest.VOWEL;
import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

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

    @Test
    public void tries_when_type_a_contained_consonant_again() {
        hangman.type(CONTAINED_CONSONANT);

        hangman.type(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }
}
