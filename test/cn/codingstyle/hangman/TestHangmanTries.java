package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanHelper.MAX_TRIES;
import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    HangmanHelper hangman = new HangmanHelper();

    @Test
    public void tries_is_12_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_char() {
        hangman.typeAnyChar();

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_return_0_when_type_a_char_after_all_tries_used() {
        hangman.typeAnyCharAfterAllTriesUsed();

        assertEquals(0, hangman.tries());
    }

}
