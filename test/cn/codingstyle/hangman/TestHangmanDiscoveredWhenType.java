package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenType {

    @Test
    public void discovered_when_type_a_contained_consonant_char() {
        HangmanHelper hangman = new HangmanHelper("end");

        hangman.type('n');

        assertEquals("en_", hangman.discovered());
    }

    @Test
    public void discovered_when_type_a_contained_consonant_char_shown_twice_in_a_word() {
        HangmanHelper hangman = new HangmanHelper("title");

        hangman.type('t');

        assertEquals("tit_e", hangman.discovered());
    }

}
