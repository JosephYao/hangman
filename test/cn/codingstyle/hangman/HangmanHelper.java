package cn.codingstyle.hangman;

import java.util.stream.IntStream;

public class HangmanHelper {
    public static final int MAX_TRIES = 12;
    private static final char ANY_CHAR = 'a';

    private final Hangman hangman = new Hangman("word");

    private void allTriesUsed() {
        IntStream.range(0, MAX_TRIES).forEach(i -> typeAnyChar());
    }

    public void typeAnyCharAndCheckAfterAllTriesUsed(Runnable gameOver) {
        allTriesUsed();
        typeAnyCharAndCheck(gameOver);
    }

    public void typeAnyCharAfterAllTriesUsed() {
        allTriesUsed();
        typeAnyChar();
    }

    public int tries() {
        return hangman.tries();
    }

    public void typeAnyChar() {
        type(ANY_CHAR);
    }

    public void typeAnyCharAndCheck(Runnable gameOver) {
        hangman.type(ANY_CHAR, gameOver);
    }

    public String used() {
        return hangman.used();
    }

    public void type(char c) {
        hangman.type(c, ()->{});
    }
}
