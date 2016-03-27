package cn.codingstyle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static cn.codingstyle.HangmanForTest.*;

public class TestHangmanUsed {

    private static final String ALL_VOWELS = "aeiou";
    HangmanForTest hangman = new HangmanForTest("word");

    @Test
    public void used_when_game_start() {
        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_vowel() {
        hangman.typeWithoutCheckGameOverAndWin(VOWEL);

        assertEquals(ALL_VOWELS, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant() {
        hangman.typeWithoutCheckGameOverAndWin(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }

    @Test
    public void used_when_type_a_consonant_again() {
        hangman.typeWithoutCheckGameOverAndWin(CONSONANT);

        hangman.typeWithoutCheckGameOverAndWin(CONSONANT);

        assertEquals(ALL_VOWELS + CONSONANT, hangman.used());
    }
}
