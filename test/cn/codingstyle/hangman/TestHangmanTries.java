package cn.codingstyle.hangman;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    private static final int MAX_TRIES = 12;
    private static final char NOT_CONTAINED_CHAR = 'z';
    private static final char CONTAINED_CONSONANT = 'w';
    Hangman hangman = new Hangman("word");

    @Test
    public void tries_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_not_contained_char() {
        hangman.type(NOT_CONTAINED_CHAR);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_remain_unchanged_when_type_a_contained_consonant() {
        hangman.type(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_contained_consonant_again() {
        hangman.type(CONTAINED_CONSONANT);

        hangman.type(CONTAINED_CONSONANT);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }

    @Test
    public void tries_return_0_even_exceed_max_tries() {
        allTriesUsed();

        hangman.type(NOT_CONTAINED_CHAR);

        assertEquals(0, hangman.tries());
    }

    private void allTriesUsed() {
        IntStream.range(0, MAX_TRIES).forEach(i -> hangman.type(NOT_CONTAINED_CHAR));
    }
}
