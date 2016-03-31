package cn.codingstyle;

import org.junit.Test;

import static cn.codingstyle.HangmanForTest.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestHangmanGameWin {

    private static final char LAST_CONTAINED_CONSONANT = 'm';
    Hangman hangman = new Hangman("am");
    Runnable mockGameWin = mock(Runnable.class);

    @Test
    public void game_not_win_when_game_start() {
        hangman.type(ANY_CHAR)
        .checkGameWin(mockGameWin);

        verify(mockGameWin, never()).run();
    }

    @Test
    public void game_win_when_type_last_contained_consonant() {
        hangman.type(LAST_CONTAINED_CONSONANT)
        .checkGameWin(mockGameWin);

        verify(mockGameWin).run();
    }
}
