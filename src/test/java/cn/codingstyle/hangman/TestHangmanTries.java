package cn.codingstyle.hangman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static cn.codingstyle.hangman.HangmanHelper.*;

public class TestHangmanTries {

    private static final char CONTAINED_CONSONANT = 'w';
    HangmanHelper hangman = new HangmanHelper("word");

    @Test
    public void tries_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_not_contained_char() {
        hangman.typeButNotCheckGameOver(NOT_CONTAINED_CHAR);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_remain_unchanged_when_type_a_contained_consonant() {
        hangman.typeButNotCheckGameOver(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_contained_consonant_again() {
        hangman.typeButNotCheckGameOver(CONTAINED_CONSONANT);

        hangman.typeButNotCheckGameOver(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_return_0_even_exceed_max_tries() {
        hangman.allTriesUsed();

        hangman.typeButNotCheckGameOver(NOT_CONTAINED_CHAR);

        assertEquals(0, hangman.tries());
    }

}
