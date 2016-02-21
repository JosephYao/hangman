package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenType {

    @Test
    public void discovered_when_type_a_not_contained_char() {
        HangmanHelper hangman = new HangmanHelper("word");

        hangman.typeButNotCheckGameOver('z');

        assertEquals("_o__", hangman.discovered());
    }
}
