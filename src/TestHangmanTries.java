import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanTries {

    @Test
    public void tries_is_12_when_game_start() {
        Hangman hangman = new Hangman("word");

        assertEquals(12, hangman.tries());
    }
}
