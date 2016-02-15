package cn.codingstyle.hangman;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static cn.codingstyle.hangman.HangmanHelper.*;

public class TestHangmanGameOver {

    Hangman hangman = new Hangman("word");

    @Test
    public void game_is_over_when_type_a_char_after_all_tries_used() {
        allTriesUsed();
        Runnable mockWhenGameOver = mock(Runnable.class);
        hangman.type(ANY_CHAR);

        hangman.whenGameOver(mockWhenGameOver);

        verify(mockWhenGameOver).run();
    }

    private void allTriesUsed() {
        IntStream.range(0, MAX_TRIES).forEach(i -> hangman.type(ANY_CHAR));
    }
}
