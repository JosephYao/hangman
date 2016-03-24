package cn.codingstyle;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    private static final char ANY_LETTER = 'x';

    @Test
    public void game_not_over_when_game_start() {
        Hangman hangman = new Hangman("word");
        Runnable mockGameOver = mock(Runnable.class);

        hangman.type(ANY_LETTER, mockGameOver);

        verify(mockGameOver, never()).run();
    }
}
