package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanForTest.*;
import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    private static final int MAX_TRIES = 12;
    HangmanForTest hangman = new HangmanForTest("word");

    @Test
    public void tries_is_12_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_not_contained_vowel() {
        hangman.typeWithoutCheck(NOT_CONTAINED_VOWEL);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_remain_unchanged_when_type_a_contained_consonant() {
        hangman.typeWithoutCheck(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_not_contained_consonant() {
        hangman.typeWithoutCheck(NOT_CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_contained_vowel() {
        hangman.typeWithoutCheck(CONTAINED_VOWEL);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_contained_consonant_again() {
        hangman.typeWithoutCheck(CONTAINED_CONSONANT);

        hangman.typeWithoutCheck(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }
}
