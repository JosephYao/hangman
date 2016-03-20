package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredDuringGame {

    @Test
    public void discovered_when_type_the_only_one_contained_consonant() {
        Hangman hangman = new Hangman("am");

        hangman.type('m', ()->{});

        assertEquals("am", hangman.discovered());
    }

    @Test
    public void discovered_when_type_a_contained_consonant_but_not_the_only_one() {
        Hangman hangman = new Hangman("and");

        hangman.type('n', ()->{});

        assertEquals("an_", hangman.discovered());
    }
}
