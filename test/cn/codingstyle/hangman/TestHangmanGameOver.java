package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestHangmanGameOver {

    HangmanHelper hangman = new HangmanHelper();

    @Test
    public void game_is_over_when_type_a_char_after_all_tries_used() {
        hangman.typeAnyCharAfterAllTriesUsed();

        Runnable mockWhenGameOver = mock(Runnable.class);
        hangman.whenGameOver(mockWhenGameOver);

        verify(mockWhenGameOver).run();
    }

}
