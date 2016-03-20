package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredDuringGame {

    @Test
    public void discovered_when_type_a_contained_consonant() {
        HangmanForTest hangman = new HangmanForTest("and");

        hangman.typeWithoutCheck('n');

        assertEquals("an_", hangman.discovered());
    }

}
