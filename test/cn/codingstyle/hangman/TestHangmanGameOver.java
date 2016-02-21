package cn.codingstyle.hangman;

import org.junit.Test;

import java.util.stream.IntStream;

import static cn.codingstyle.hangman.HangmanHelper.*;
import static org.mockito.Mockito.*;

public class TestHangmanGameOver {

    private static final char ANY_CHAR = 'x';
    Hangman hangman =  new Hangman("word");
    Runnable gameOver = mock(Runnable.class);

    @Test
    public void game_not_over_when_game_start() {
        hangman.type(ANY_CHAR, gameOver);

        verify(gameOver, never()).run();
    }

    @Test
    public void game_over_when_type_a_wrong_last_try() {
        onlyLastTryLeft();

        hangman.type(NOT_CONTAINED_CHAR, gameOver);

        verify(gameOver).run();
    }

    private void onlyLastTryLeft() {
        IntStream.range(0, MAX_TRIES - 1).forEach(i -> hangman.type(NOT_CONTAINED_CHAR));
    }

}
