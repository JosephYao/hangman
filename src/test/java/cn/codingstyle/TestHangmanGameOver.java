package cn.codingstyle;

import org.junit.Test;

import java.util.stream.IntStream;

import static cn.codingstyle.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    HangmanForTest hangman = new HangmanForTest("word");
    Runnable mockGameOver = mock(Runnable.class);

    @Test
    public void game_not_over_when_game_start() {
        hangman.typeAndCheckGameOver(ANY_LETTER, mockGameOver);

        verify(mockGameOver, never()).run();
    }

    @Test
    public void game_is_over_when_type_wrong_char_at_last_try() {
        allTriesUsedExceptLast();

        hangman.typeAndCheckGameOver(ANY_LETTER, mockGameOver);

        verify(mockGameOver).run();
    }

    private void allTriesUsedExceptLast() {
        IntStream.range(0, MAX_TRIES - 1).
                forEach(i -> hangman.typeWithoutCheckGameOverAndWin(ANY_LETTER));
    }
}
