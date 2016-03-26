package cn.codingstyle;

public class HangmanForTest extends Hangman {
    public static final char VOWEL = 'a';
    public static final char CONSONANT = 'b';
    public static final char NOT_CONTAINED_CONSONANT = 'b';
    public static final char CONTAINED_CONSONANT = 'w';
    public static final int MAX_TRIES = 12;
    public static final char ANY_LETTER = 'x';

    public HangmanForTest(String word) {
        super(word);
    }

    public void typeWithoutCheckGameOver(char c) {
        type(c, ()->{});
    }
}
