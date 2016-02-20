package cn.codingstyle.hangman;

import java.util.stream.IntStream;

public class HangmanHelper {
    public static final int MAX_TRIES = 12;
    private static final char ANY_CHAR = 'a';
    private static final char NOT_CONTAINED_CHAR = 'z';
    public static final char CONTAINED_CONSONANT_CHAR = 'g';

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

    public void typeAnyCharAndCheckAfterAllTriesUsed(Runnable gameOver) {
        allTriesUsed();
        typeAnyCharAndCheck(gameOver);
    }

    public void typeAnyCharAfterAllTriesUsed() {
        allTriesUsed();
        typeNotContainedChar();
    }

    public int tries() {
        return hangman.tries();
    }

    public void typeNotContainedChar() {
        type(NOT_CONTAINED_CHAR);
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

    public String discovered() {
        return hangman.discovered();
    }
}
