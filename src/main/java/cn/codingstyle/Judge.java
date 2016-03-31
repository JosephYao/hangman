package cn.codingstyle;

public class Judge {
    private final Hangman hangman;
    private final String word;

    public Judge(Hangman hangman, String word) {
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
        if (allCharsDiscovered(hangman))
            gameWin.run();
    }

    private boolean allCharsDiscovered(Hangman hangman) {
        return word.equals(hangman.discovered());
    }
}