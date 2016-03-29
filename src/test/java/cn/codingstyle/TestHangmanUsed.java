package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    Hangman hangman = new Hangman("word");

    @Test
    public void used_when_game_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_vowel() {
        hangman.type(VOWEL);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant() {
        hangman.type(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant_again() {
        hangman.type(CONSONANT);

        hangman.type(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }
}
