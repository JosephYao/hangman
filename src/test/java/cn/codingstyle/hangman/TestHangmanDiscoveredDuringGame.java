package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredDuringGame {

    private static final char ONLY_CONTAINED_CONSONANT = 'm';

    @Test
    public void discovered_when_type_the_only_one_contained_consonant() {
        Hangman hangman = new Hangman("am");

        hangman.type(ONLY_CONTAINED_CONSONANT, ()->{});

        assertEquals("am", hangman.discovered());
    }
}
