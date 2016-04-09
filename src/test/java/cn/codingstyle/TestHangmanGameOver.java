package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    HangmanForTest hangman = new HangmanForTest("word");
    Runnable mockAfterGameOver = mock(Runnable.class);

    @Test
    public void game_not_over_when_game_start() {
        hangman.type(ANY_CHAR)
                .checkGameOver(mockAfterGameOver);

        verify(mockAfterGameOver, never()).run();
    }

    @Test
    public void game_over_when_last_try_failed() {
        hangman.allTriesUsedExceptLast();

        hangman.type(ANY_CHAR)
                .checkGameOver(mockAfterGameOver);

        verify(mockAfterGameOver).run();
    }

}
