package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    private static final String ALL_VOWEL_CHARS = "aeiou";
    private static final char VOWEL = 'a';
    Hangman hangman = new Hangman("word");

    @Test
    public void used_is_all_vowel_chars_when_game_start() {
        assertEquals(ALL_VOWEL_CHARS, hangman.used());
    }
    
    @Test
    public void used_is_still_all_vowel_chars_when_type_vowel_char() {
        hangman.type(VOWEL);

        assertEquals(ALL_VOWEL_CHARS, hangman.used());
    }
}
