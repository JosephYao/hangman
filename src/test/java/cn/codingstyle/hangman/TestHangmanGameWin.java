package cn.codingstyle.hangman;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestHangmanGameWin {

    private final Runnable mockGameWin = mock(Runnable.class);

    @Test
    public void game_not_win_when_game_start() {
        Hangman hangman = new Hangman("word");

        hangman.type('w', ()->{}, mockGameWin);

        verify(mockGameWin, never()).run();
    }

    @Test
    public void game_win_when_discover_all_chars() {
        Hangman hangman = new Hangman("am");

        hangman.type('m', ()->{}, mockGameWin);

        verify(mockGameWin).run();
    }
}
