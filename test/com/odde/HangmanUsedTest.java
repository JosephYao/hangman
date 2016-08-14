package com.odde;

import org.junit.Test;

import static com.odde.HangmanHelper.CONSONANT;
import static com.odde.HangmanHelper.VOWEL;
import static org.junit.Assert.assertEquals;

public class HangmanUsedTest {

    private static final String ALL_VOWELS = "aeiou";

    HangmanHelper hangman = new HangmanHelper("word");

    @Test
    public void all_vowels_when_game_just_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void all_vowels_when_type_one_vowel() {
        hangman.typeButNotCareGameOverOrWin(VOWEL);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void all_vowels_plus_one_consonant_when_type_one_consonant() {
        hangman.typeButNotCareGameOverOrWin(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }

    @Test
    public void one_consonant_only_show_once_when_type_twice() {
        hangman.typeButNotCareGameOverOrWin(CONSONANT);

        hangman.typeButNotCareGameOverOrWin(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }
}
