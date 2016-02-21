package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    @Test
    public void game_not_over_when_game_start() {
        Hangman hangman = new Hangman("word");
        Runnable gameOver = mock(Runnable.class);

        hangman.type('x', gameOver);

        verify(gameOver, never()).run();
    }
}
