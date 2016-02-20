package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanHelper.*;
import static org.junit.Assert.assertEquals;

public class TestHangmanTriesWhenTypeContainedChar {

    HangmanHelper hangman = new HangmanHelper("game");

    @Test
    public void tries_remain_unchanged_when_type_a_contained_consonant_char_at_first_time() {
        hangman.type(CONTAINED_CONSONANT_CHAR);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_contained_consonant_char_again() {
        hangman.type(CONTAINED_CONSONANT_CHAR);

        hangman.type(CONTAINED_CONSONANT_CHAR);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

}
