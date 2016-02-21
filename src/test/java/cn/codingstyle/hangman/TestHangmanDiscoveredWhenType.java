package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenType {

    HangmanHelper hangman = new HangmanHelper("word");

    @Test
    public void discovered_when_type_a_not_contained_char() {
        hangman.typeButNotCheckGameOver('z');

        assertEquals("_o__", hangman.discovered());
    }

    @Test
    public void discovered_when_type_a_contained_char() {
        hangman.typeButNotCheckGameOver('w');

        assertEquals("wo__", hangman.discovered());
    }
}
