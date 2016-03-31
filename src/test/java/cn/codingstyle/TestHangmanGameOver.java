package cn.codingstyle;

import org.junit.Test;

import java.util.stream.IntStream;

import static cn.codingstyle.HangmanForTest.*;
import static cn.codingstyle.HangmanForTest.MAX_TRIES;
import static org.mockito.Mockito.*;

public class TestHangmanGameOver {

    Hangman hangman = new Hangman("word");
    Runnable mockGameOver = mock(Runnable.class);

    @Test
    public void game_not_over_when_game_start() {
        hangman.type(ANY_CHAR)
        .checkGameOver(mockGameOver)
        .checkGameWin(WHATEVER);

        verify(mockGameOver, never()).run();
    }

    @Test
    public void game_over_when_last_try_failed() {
        allTriesUsedExceptLast();

        hangman.type(ANY_CHAR)
        .checkGameOver(mockGameOver);

        verify(mockGameOver).run();
    }

    private void allTriesUsedExceptLast() {
        IntStream.range(0, MAX_TRIES - 1).forEach(i -> hangman.type(ANY_CHAR));
    }
}
