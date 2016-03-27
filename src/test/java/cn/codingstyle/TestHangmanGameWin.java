package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameWin {

    @Test
    public void game_not_win_when_game_start() {
        HangmanForTest hangman = new HangmanForTest("word");
        Runnable mockGameWin = mock(Runnable.class);

        hangman.typeAndCheckGameWin(ANY_LETTER, mockGameWin);

        verify(mockGameWin, never()).run();
    }
}
