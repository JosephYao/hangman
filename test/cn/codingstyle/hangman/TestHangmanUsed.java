package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    @Test
    public void used_when_game_start() {
        Hangman hangman = new Hangman("word");

        assertEquals("aeiou", hangman.used());
    }
}
