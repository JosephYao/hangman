import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    private static final int MAX_TRIES = 12;
    private static final char ANY_CHAR = 'a';
    Hangman hangman = new Hangman("word");

    @Test
    public void tries_is_12_when_game_start() {
        assertEquals(MAX_TRIES, hangman.tries());
    }

    @Test
    public void tries_decrease_one_when_type_a_char() {
        hangman.type(ANY_CHAR);

        assertEquals(MAX_TRIES - 1, hangman.tries());
    }
}
