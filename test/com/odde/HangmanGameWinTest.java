package com.odde;

import org.junit.Test;

import static com.odde.HangmanHelper.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class HangmanGameWinTest {

    HangmanHelper hangman = new HangmanHelper("word");
    Runnable afterGameWin = mock(Runnable.class);

    @Test
    public void game_not_win_when_game_just_start() {
        hangman.type(ANY_CHAR, WHAT_EVER, afterGameWin);

        verify(afterGameWin, never()).run();
    }

    @Test
    public void game_win_when_type_last_correct_consonant() {
        hangman.typeButNotCareGameOverOrWin('w');
        hangman.typeButNotCareGameOverOrWin('r');

        hangman.type('d', WHAT_EVER, afterGameWin);

        verify(afterGameWin).run();
    }
}
