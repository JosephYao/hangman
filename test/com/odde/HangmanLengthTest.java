package com.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanLengthTest {

    @Test
    public void length_of_word() {
        Hangman hangman = new Hangman("word");

        assertEquals(4, hangman.length());
    }
}
