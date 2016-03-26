package cn.codingstyle;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    Hangman hangman = new Hangman("word");
    Runnable mockGameOver = mock(Runnable.class);

    @Test
    public void game_not_over_when_game_start() {
        hangman.type(HangmanForTest.ANY_LETTER, mockGameOver);

        verify(mockGameOver, never()).run();
    }

    @Test
    public void game_is_over_when_type_wrong_char_at_last_try() {
        allTriesUsedExceptLast();

        hangman.type(HangmanForTest.ANY_LETTER, mockGameOver);

        verify(mockGameOver).run();
    }

    private void allTriesUsedExceptLast() {
        IntStream.range(0, HangmanForTest.MAX_TRIES - 1).forEach(i -> hangman.type(HangmanForTest.ANY_LETTER, () -> {}));
    }
}
