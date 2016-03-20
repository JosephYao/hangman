package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestHangmanGameWin {

    @Test
    public void game_not_win_when_game_start() {
        Hangman hangman = new Hangman("word");

        Runnable mockGameWin = mock(Runnable.class);
        hangman.type('w', ()->{}, mockGameWin);

        verify(mockGameWin, never()).run();
    }
}
