package com.odde;

public class Judge {
    private final Hangman hangman;
    private final String word;

    public Judge(Hangman hangman, String word) {
        this.hangman = hangman;
        this.word = word;
    }

    public void checkGameWin(Runnable afterGameWin) {
        if (word.equals(hangman.discovered()))
            afterGameWin.run();
    }

    public void checkGameOver(Runnable afterGameOver) {
        if (hangman.tries() == 0)
            afterGameOver.run();
    }
}