package cn.codingstyle.hangman;

import org.junit.Test;

import java.util.stream.IntStream;

import static cn.codingstyle.hangman.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameLost {

    HangmanForTest hangman = new HangmanForTest("word");
    Runnable gameLost = mock(Runnable.class);

    @Test
    public void game_not_lost_when_type_a_not_contained_char_after_game_start() {
        hangman.type(NOT_CONTAINED_CONSONANT, gameLost);

        verify(gameLost, never()).run();
    }

    @Test
    public void game_lost_when_last_try_failed() {
        givenOnlyLastTryLeft();

        hangman.type(NOT_CONTAINED_CONSONANT, gameLost);

        verify(gameLost).run();
    }

    private void givenOnlyLastTryLeft() {
        IntStream.range(0, 11).forEach(i -> hangman.typeWithoutCheckGameLost(NOT_CONTAINED_CONSONANT));
    }
}
