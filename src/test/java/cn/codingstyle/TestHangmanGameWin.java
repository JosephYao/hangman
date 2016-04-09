package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameWin {

    HangmanForTest hangman = new HangmanForTest(WORD_HAS_ONE_CONSONANT_TO_GUESS);
    Runnable mockAfterGameWin = mock(Runnable.class);

    @Test
    public void game_not_win_when_game_start() {
        hangman.type(ANY_CHAR)
                .checkGameWin(mockAfterGameWin);

        verify(mockAfterGameWin, never()).run();
    }

    @Test
    public void game_win_when_discover_last_contained_consonant() {
        hangman.type(LAST_CONTAINED_CONSONANT)
                .checkGameWin(mockAfterGameWin);

        verify(mockAfterGameWin).run();
    }
}
