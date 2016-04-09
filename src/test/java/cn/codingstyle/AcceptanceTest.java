package cn.codingstyle;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static cn.codingstyle.HangmanForTest.*;

public class AcceptanceTest {

    @Test
    public void last_try_game_win() {
        HangmanForTest hangman = new HangmanForTest(WORD_HAS_ONE_CONSONANT_TO_GUESS);
        Runnable mockAfterGameWin = mock(Runnable.class);
        Runnable mockAfterGameOver = mock(Runnable.class);
        hangman.allTriesUsedExceptLast();

        hangman.type(LAST_CONTAINED_CONSONANT)
                .checkGameOver(mockAfterGameOver)
                .checkGameWin(mockAfterGameWin);

        verify(mockAfterGameOver, never()).run();
        verify(mockAfterGameWin).run();
    }
}
