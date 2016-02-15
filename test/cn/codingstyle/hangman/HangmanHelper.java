package cn.codingstyle.hangman;

import java.util.stream.IntStream;

public class HangmanHelper {
    public static final int MAX_TRIES = 12;
    private static final char ANY_CHAR = 'a';

    private final Hangman hangman = new Hangman("word");

    private void allTriesUsed() {
        IntStream.range(0, MAX_TRIES).forEach(i -> hangman.type(ANY_CHAR));
    }

    public void typeAnyCharAfterAllTriesUsed() {
        allTriesUsed();
        typeAnyChar();
    }

    public void whenGameOver(Runnable whenGameOver) {
        hangman.whenGameOver(whenGameOver);
    }

    public int tries() {
        return hangman.tries();
    }

    public void typeAnyChar() {
        hangman.type(ANY_CHAR);
    }
}
