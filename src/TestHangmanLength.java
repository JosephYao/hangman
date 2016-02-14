import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHangmanLength {

    @Test
    public void length_of_word_when_game_start() {
        Hangman hangman = new Hangman("word");

        assertEquals(4, hangman.length());
    }
}
