package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    @Test
    public void discovered_word_when_game_start_with_one_vowel_char_word() {
        Hangman hangman = new Hangman("a");

        assertEquals("a", hangman.discovered());
    }
    
}
