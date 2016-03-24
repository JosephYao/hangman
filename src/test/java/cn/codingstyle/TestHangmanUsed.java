package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static cn.codingstyle.HangmanForTest.*;

public class TestHangmanUsed {

    private static final String ALL_VOWELS = "aeiou";
    Hangman hangman = new Hangman("word");

    @Test
    public void used_when_game_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_vowel() {
        hangman.type(VOWEL, null);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant() {
        hangman.type(CONSONANT, null);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant_again() {
        hangman.type(CONSONANT, null);

        hangman.type(CONSONANT, null);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }
}
