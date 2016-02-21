package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    private static final char VOWEL = 'a';
    Hangman hangman = new Hangman("word");

    @Test
    public void used_when_game_start() {
        assertEquals("aeiou", hangman.used());
    }

    @Test
    public void nothing_appended_to_used_when_type_a_vowel_char() {
        hangman.type(VOWEL);

        assertEquals("aeiou", hangman.used());
    }
}
