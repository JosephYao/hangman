package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameWin {

    HangmanForTest hangman = new HangmanForTest("am");
    Runnable mockGameWin = mock(Runnable.class);

    @Test
    public void game_not_win_when_game_start() {
        hangman.typeAndCheckGameWin(ANY_LETTER, mockGameWin);

        verify(mockGameWin, never()).run();
    }

    @Test
    public void game_win_when_discover_last_consonant() {
        hangman.typeAndCheckGameWin(LAST_CORRECT_CONSONANT, mockGameWin);

        verify(mockGameWin).run();
    }
}
