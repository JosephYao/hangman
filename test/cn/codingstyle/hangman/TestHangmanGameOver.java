package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    HangmanHelper hangman = new HangmanHelper();
    private final Runnable gameOver = mock(Runnable.class);

    @Test
    public void game_is_not_over_when_game_start() {
        hangman.typeAnyCharAndCheck(gameOver);

        verify(gameOver, never()).run();
    }

    @Test
    public void game_is_over_when_type_a_char_after_all_tries_used() {
        hangman.typeAnyCharAndCheckAfterAllTriesUsed(gameOver);

        verify(gameOver).run();
    }

}
