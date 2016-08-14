package com.odde;

import org.junit.Test;

import static com.odde.HangmanHelper.*;
import static org.junit.Assert.assertEquals;

public class HangmanTriesTest {

    HangmanHelper hangman = new HangmanHelper("word");

    @Test
    public void max_tries_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void reduce_one_when_type_a_vowel() {
        hangman.typeButNotCareGameOverOrWin(VOWEL);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void max_tries_unchanged_when_type_a_correct_consonant() {
        hangman.typeButNotCareGameOverOrWin(CORRECT_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void reduce_one_when_type_a_wrong_consonant() {
        hangman.typeButNotCareGameOverOrWin(WRONG_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void reduce_one_when_type_a_correct_consonant_again() {
        hangman.typeButNotCareGameOverOrWin(CORRECT_CONSONANT);

        hangman.typeButNotCareGameOverOrWin(CORRECT_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

}
