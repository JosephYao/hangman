package cn.codingstyle.hangman;

import org.junit.Test;

import static cn.codingstyle.hangman.HangmanHelper.*;
import static org.mockito.Mockito.*;

public class TestHangmanGameOver {

    private static final char ANY_CHAR = 'x';
    HangmanHelper hangman =  new HangmanHelper("word");
    Runnable gameOver = mock(Runnable.class);

    @Test
    public void game_not_over_when_game_start() {
        hangman.type(ANY_CHAR, gameOver, () -> {});

        verify(gameOver, never()).run();
    }

    @Test
    public void game_over_when_type_a_wrong_last_try() {
        hangman.onlyLastTryLeft();

        hangman.type(NOT_CONTAINED_CHAR, gameOver, () -> {});

        verify(gameOver).run();
    }

}
