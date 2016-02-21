package cn.codingstyle.hangman;

import java.util.stream.IntStream;

public class HangmanHelper extends Hangman {
    public static final int MAX_TRIES = 12;
    public static final char NOT_CONTAINED_CHAR = 'z';
    public static final char ANY_CHAR = 'x';

    public HangmanHelper(String word) {
        super(word);
    }

    public void typeButNotCheckGameOver(char c) {
        type(c, ()->{}, () -> {
        });
    }

    public void allTriesUsed() {
        triesManyTimes(MAX_TRIES);
    }

    public void onlyLastTryLeft() {
        triesManyTimes(MAX_TRIES - 1);
    }

    private void triesManyTimes(int times) {
        IntStream.range(0, times).forEach(i -> typeButNotCheckGameOver(NOT_CONTAINED_CHAR));
    }
}
