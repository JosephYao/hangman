package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    HangmanHelper hangman = new HangmanHelper();
    private final Runnable mockWhenGameOver = mock(Runnable.class);

    @Test
    public void game_is_not_over_when_game_start() {
        hangman.typeAnyChar(mockWhenGameOver);

        verify(mockWhenGameOver, never()).run();
    }

    @Test
    public void game_is_over_when_type_a_char_after_all_tries_used() {
        hangman.typeAnyCharAfterAllTriesUsed(mockWhenGameOver);

        verify(mockWhenGameOver).run();
    }

}
