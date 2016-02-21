package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanDiscovered {

    private static final String ONE_VOWEL_WORD = "a";

    @Test
    public void discovered_when_game_start_with_one_vowel_word() {
        Hangman hangman = new Hangman(ONE_VOWEL_WORD);

        assertEquals(ONE_VOWEL_WORD, hangman.discovered());
    }
}
