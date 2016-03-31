package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.junit.Assert.assertEquals;

public class TestHangmanUsed {

    HangmanForTest hangman = new HangmanForTest("word");

    @Test
    public void used_when_game_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_vowel() {
        hangman.typeWithoutCheckGameOverAndGameWin(VOWEL);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant() {
        hangman.typeWithoutCheckGameOverAndGameWin(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant_again() {
        hangman.typeWithoutCheckGameOverAndGameWin(CONSONANT);

        hangman.typeWithoutCheckGameOverAndGameWin(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }
}
