package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    HangmanForTest hangman = new HangmanForTest("word");

    @Test
    public void tries_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_when_type_a_vowel() {
        hangman.typeWithoutCheckGameOverAndWin(VOWEL);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_when_type_a_not_contained_consonant() {
        hangman.typeWithoutCheckGameOverAndWin(NOT_CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_when_type_a_contained_consonant() {
        hangman.typeWithoutCheckGameOverAndWin(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_when_type_a_contained_consonant_again() {
        hangman.typeWithoutCheckGameOverAndWin(CONTAINED_CONSONANT);

        hangman.typeWithoutCheckGameOverAndWin(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }
}
