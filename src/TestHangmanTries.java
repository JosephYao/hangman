import org.junit.Test;

import java.util.stream.IntStream;

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

    @Test
    public void tries_return_0_when_type_a_char_after_all_tries_used() {
        allTriesUsed();

        hangman.type(ANY_CHAR);

        assertEquals(0, hangman.tries());
    }

    private void allTriesUsed() {
        IntStream.range(0, MAX_TRIES).forEach(i -> {
            hangman.type(ANY_CHAR);
        });
    }
}
