package com.odde;

import org.junit.Test;

import static com.odde.HangmanHelper.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class HangmanGameWinTest {

    @Test
    public void game_not_win_when_game_just_start() {
        Hangman hangman = new Hangman("word");
        Runnable afterGameWin = mock(Runnable.class);

        hangman.type(ANY_CHAR, WHAT_EVER, afterGameWin);

        verify(afterGameWin, never()).run();
    }
}
