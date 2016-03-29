package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    private static final String ALL_VOWELS = "aeiou";
    private static final char VOWEL = 'a';
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
}
