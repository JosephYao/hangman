package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    private static final String PLACEHOLDER = "_";

    @Test
    public void one_consonant_word_when_game_start() {
        Hangman hangman = new Hangman("b");

        assertEquals(PLACEHOLDER, hangman.discovered());
    }
}
