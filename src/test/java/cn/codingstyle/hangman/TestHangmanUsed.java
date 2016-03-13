package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    private static final String ALL_VOWEL = "aeiou";
    private static final char VOWEL = 'a';
    private static final char CONSONANT = 'b';
    Hangman hangman = new Hangman("word");

    @Test
    public void used_is_all_vowel_when_game_start() {
        assertEquals(ALL_VOWEL, hangman.used());
    }

    @Test
    public void used_remain_unchanged_when_type_a_vowel() {
        hangman.type(VOWEL, null);

        assertEquals(ALL_VOWEL, hangman.used());
    }

    @Test
    public void a_consonant_appended_to_used_when_type_it() {
        hangman.type(CONSONANT, null);

        assertEquals(ALL_VOWEL + CONSONANT, hangman.used());
    }

    @Test
    public void used_remain_unchanged_when_type_a_consonant_again() {
        hangman.type(CONSONANT, null);

        hangman.type(CONSONANT, null);

        assertEquals(ALL_VOWEL + CONSONANT, hangman.used());
    }
}
