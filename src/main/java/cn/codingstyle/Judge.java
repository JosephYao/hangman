package cn.codingstyle;

public class Judge {
    private final Hangman hangman;
    private final String word;

    public Judge(Hangman hangman, String word) {
        this.hangman = hangman;
        this.word = word;
    }

    public Judge checkGameOver(Runnable afterGameOver) {
        if (allTriesUsed())
            afterGameOver.run();
        return this;
    }

    private boolean allTriesUsed() {
        return hangman.tries() == 0;
    }

    public Judge checkGameWin(Runnable afterGameWin) {
        if (allCharsDiscovered())
            afterGameWin.run();
        return this;
    }

    private boolean allCharsDiscovered() {
        return word.equals(hangman.discovered());
    }
}