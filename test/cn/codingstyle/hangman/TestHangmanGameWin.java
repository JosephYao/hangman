package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanHelper.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameWin {

    @Test
    public void game_not_win_when_game_start() {
        Hangman hangman = new Hangman("word");

        Runnable gameWin = mock(Runnable.class);
        hangman.type(ANY_CHAR, ()->{}, gameWin);

        verify(gameWin, never()).run();
    }
}
