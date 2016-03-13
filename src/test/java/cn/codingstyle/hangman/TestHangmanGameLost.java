package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameLost {

    @Test
    public void game_not_lost_when_type_a_not_contained_char_after_game_start() {
        Hangman hangman = new Hangman("word");
        Runnable gameLost = mock(Runnable.class);

        hangman.type('z', gameLost);

        verify(gameLost, never()).run();
    }
}
