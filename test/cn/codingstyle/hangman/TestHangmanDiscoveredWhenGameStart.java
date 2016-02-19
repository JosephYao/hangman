package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscoveredWhenGameStart {

    @Test
    public void discovered_when_one_vowel_char_word() {
        assertDiscoveredEquals("a", "a");
    }

    @Test
    public void discovered_when_one_consonant_char_word() {
        assertDiscoveredEquals("_", "b");
    }

    @Test
    public void discovered_when_two_vowel_chars_word() {
        assertDiscoveredEquals("ai", "ai");
    }

    @Test
    public void discovered_when_one_vowel_char_and_one_consonant_char_word() {
        assertDiscoveredEquals("a_", "am");
    }

    private void assertDiscoveredEquals(String expected, String word) {
        assertEquals(expected, new Hangman(word).discovered());
    }

}
