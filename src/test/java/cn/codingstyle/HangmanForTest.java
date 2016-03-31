package cn.codingstyle;

public class HangmanForTest extends Hangman {
    public static final String ALL_VOWELS = "aeiou";
    public static final char VOWEL = 'a';
    public static final char CONTAINED_CONSONANT = 'w';
    public static final char NOT_CONTAINED_CONSONANT = 'b';
    public static final char CONSONANT = 'b';
    public static final int MAX_TRIES = 12;
    public static final char ANY_CHAR = 'x';
    private static final Runnable WHATEVER = () -> {
    };

    public HangmanForTest(String word) {
        super(word);
    }

    public void typeWithoutCheckGameOverAndGameWin(char c) {
        type(c, WHATEVER, WHATEVER);
    }

    public void typeAndCheckGameWin(char c, Runnable gameWin) {
        type(c, WHATEVER, gameWin);
    }

    public void typeAndCheckGameOver(char c, Runnable gameOver) {
        type(c, gameOver, WHATEVER);
    }
}
