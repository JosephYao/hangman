package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanLength {

    @Test
    public void length_of_word() {
        Hangman hangman = new Hangman("word");

        assertEquals(4, hangman.length());
    }
}
