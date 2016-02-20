package cn.codingstyle.hangman;

import java.util.stream.IntStream;

public class HangmanHelper {
    public static final int MAX_TRIES = 12;
    private static final char ANY_CHAR = 'x';
    private static final char NOT_CONTAINED_CHAR = 'z';

    private final Hangman hangman;

    public HangmanHelper() {
        this("word");
    }

    public HangmanHelper(String word) {
        hangman = new Hangman(word);
    }

    private void allTriesUsed() {
        IntStream.range(0, MAX_TRIES).forEach(i -> typeNotContainedChar());
    }

    public void typeAnyCharAndCheckGameOverAfterAllTriesUsed(Runnable gameOver) {
        allTriesUsed();
        typeAnyCharAndCheckGameOver(gameOver);
    }

    public void typeAnyCharAfterAllTriesUsed() {
        allTriesUsed();
        type(ANY_CHAR);
    }

    public int tries() {
        return hangman.tries();
    }

    public void typeNotContainedChar() {
        type(NOT_CONTAINED_CHAR);
    }

    public void typeAnyCharAndCheckGameOver(Runnable gameOver) {
        hangman.type(ANY_CHAR, gameOver, ()->{});
    }

    public String used() {
        return hangman.used();
    }

    public void type(char c) {
        hangman.type(c, ()->{}, ()->{});
    }

    public String discovered() {
        return hangman.discovered();
    }

    public void typeAnyCharAndCheckGameWin(Runnable gameWin) {
        hangman.type(ANY_CHAR, ()->{}, gameWin);
    }
}
