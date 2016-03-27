package cn.codingstyle;

public class GameChecker {
    private final Hangman hangman;
    private final String word;

    public GameChecker(Hangman hangman, String word) {
        this.hangman = hangman;
        this.word = word;
    }

    public void checkGameOver(Runnable gameOver) {
        if (hasNoMoreTry())
            gameOver.run();
    }

    private boolean hasNoMoreTry() {
        return hangman.tries() == 0;
    }

    public void checkGameWin(Runnable gameWin) {
        if (hasDiscoveredAllChars(hangman))
            gameWin.run();
    }

    private boolean hasDiscoveredAllChars(Hangman hangman) {
        return word.equals(hangman.discovered());
    }
}