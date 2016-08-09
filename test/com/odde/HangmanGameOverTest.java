package com.odde;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class HangmanGameOverTest {

    private static final char ANY_CHAR = 'x';

    @Test
    public void game_is_not_over_when_type_any_char_after_game_start() {
        Hangman hangman = new Hangman("word");

        Runnable afterGameOver = mock(Runnable.class);
        hangman.type(ANY_CHAR, afterGameOver);

        verify(afterGameOver, never()).run();
    }
}
