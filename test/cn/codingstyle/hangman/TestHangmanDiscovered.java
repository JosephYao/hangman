package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    @Test
    public void discovered_word_when_game_start() {
        Hangman hangman = new Hangman("word");

        assertEquals("w_rd", hangman.discovered());
    }
}
