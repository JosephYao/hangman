package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOverAndWin {

    HangmanHelper hangman = new HangmanHelper();
    private final Runnable gameOver = mock(Runnable.class);
    private final Runnable gameWin = mock(Runnable.class);

    @Test
    public void game_is_not_over_when_game_start() {
        hangman.typeAnyCharAndCheckGameOver(gameOver);

        verify(gameOver, never()).run();
    }

    @Test
    public void game_is_over_when_type_a_char_after_all_tries_used() {
        hangman.typeAnyCharAndCheckGameOverAfterAllTriesUsed(gameOver);

        verify(gameOver).run();
    }

    @Test
    public void game_is_not_win_when_game_start() {
        hangman.typeAnyCharAndCheckGameWin(gameWin);

        verify(gameWin, never()).run();
    }

}
