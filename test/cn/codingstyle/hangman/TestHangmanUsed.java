package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    private static final char VOWEL = 'a';
    private static final String ALL_VOWELS = "aeiou";
    private static final char CONSONANT = 'b';
    Hangman hangman = new Hangman("word");

    @Test
    public void used_when_game_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void nothing_appended_to_used_when_type_a_vowel() {
        hangman.type(VOWEL);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void char_appended_to_used_when_type_a_consonant_first_time() {
        hangman.type(CONSONANT);

        assertEquals(ALL_VOWELS + String.valueOf(CONSONANT), hangman.used());
    }

    @Test
    public void nothing_appended_to_used_when_type_a_consonant_again() {
        hangman.type(CONSONANT);

        hangman.type(CONSONANT);

        assertEquals(ALL_VOWELS + String.valueOf(CONSONANT), hangman.used());
    }
}
