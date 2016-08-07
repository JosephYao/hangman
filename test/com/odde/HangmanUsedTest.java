package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanUsedTest {

    private static final String ALL_VOWELS = "aeiou";
    private static final char VOWEL = 'a';
    private static final char CONSONANT = 'b';

    Hangman hangman = new Hangman("word");

    @Test
    public void all_vowels_when_game_just_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void all_vowels_when_type_one_vowel() {
        hangman.type(VOWEL);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void all_vowels_plus_one_consonant_when_type_one_consonant() {
        hangman.type(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }
}
