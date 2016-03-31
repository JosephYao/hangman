package cn.codingstyle;

public class Judge {
    private final Hangman hangman;
    private final String word;

    public Judge(Hangman hangman, String word) {
        this.hangman = hangman;
        this.word = word;
    }

    public Judge checkGameOver(Runnable gameOver) {
        if (hasNoMoreTry())
            gameOver.run();

        return this;
    }

    private boolean hasNoMoreTry() {
        return hangman.tries() == 0;
    }

    public Judge checkGameWin(Runnable gameWin) {
        if (allCharsDiscovered(hangman))
            gameWin.run();

        return this;
    }

    private boolean allCharsDiscovered(Hangman hangman) {
        return word.equals(hangman.discovered());
    }
}