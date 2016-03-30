package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {
    
    @Test
    public void one_consonant_word_when_game_start() {
        Hangman hangman = new Hangman("b");

        assertEquals("_", hangman.discovered());
    }
}
