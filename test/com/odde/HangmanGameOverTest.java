package com.odde;

import org.junit.Test;

import java.util.stream.IntStream;

import static com.odde.HangmanHelper.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class HangmanGameOverTest {

    HangmanHelper hangman = new HangmanHelper("word");
    Runnable afterGameOver = mock(Runnable.class);

    @Test
    public void game_is_not_over_when_type_any_char_after_game_start() {
        hangman.type(ANY_CHAR, afterGameOver, WHAT_EVER);

        verify(afterGameOver, never()).run();
    }

    @Test
    public void game_is_over_when_type_a_wrong_char_at_last_chance() {
        typeWrongTillLastChance();

        hangman.type(WRONG_CONSONANT, afterGameOver, WHAT_EVER);

        verify(afterGameOver).run();
    }

    private void typeWrongTillLastChance() {
        IntStream.range(0, MAX_TRIES - 1)
                .forEach(i -> hangman.typeButNotCareGameOverOrWin(WRONG_CONSONANT));
    }
}
