package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanHelper.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameWin {

    Runnable gameWin = mock(Runnable.class);

    @Test
    public void game_not_win_when_game_start() {
        Hangman hangman = new Hangman("word");

        hangman.type(ANY_CHAR, WHATEVER, gameWin);

        verify(gameWin, never()).run();
    }

    @Test
    public void game_win_when_discovering_last_char() {
        Hangman hangman = new Hangman("eye");

        hangman.type('y', WHATEVER, gameWin);

        verify(gameWin).run();
    }
}
