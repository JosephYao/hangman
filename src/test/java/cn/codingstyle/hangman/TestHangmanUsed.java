package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanForTest.*;
import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    HangmanForTest hangman = new HangmanForTest("word");

    @Test
    public void used_is_all_vowel_when_game_start() {
        assertEquals(ALL_VOWEL, hangman.used());
    }

    @Test
    public void used_remain_unchanged_when_type_a_vowel() {
        hangman.typeWithoutCheckGameLost(VOWEL);

        assertEquals(ALL_VOWEL, hangman.used());
    }

    @Test
    public void a_consonant_appended_to_used_when_type_it() {
        hangman.typeWithoutCheckGameLost(CONSONANT);

        assertEquals(ALL_VOWEL + CONSONANT, hangman.used());
    }

    @Test
    public void used_remain_unchanged_when_type_a_consonant_again() {
        hangman.typeWithoutCheckGameLost(CONSONANT);

        hangman.typeWithoutCheckGameLost(CONSONANT);

        assertEquals(ALL_VOWEL + CONSONANT, hangman.used());
    }
}
