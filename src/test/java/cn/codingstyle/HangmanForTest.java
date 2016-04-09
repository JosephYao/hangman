package cn.codingstyle;

import java.util.stream.IntStream;

public class HangmanForTest extends Hangman {
    public static final char VOWEL = 'a';
    public static final char CONTAINED_CONSONANT = 'w';
    public static final char NOT_CONTAINED_CONSONANT = 'z';
    public static final char CONSONANT = 'b';
    public static final int MAX_TRIES = 12;
    public static final char ANY_CHAR = 'x';
    public static final char LAST_CONTAINED_CONSONANT = 'm';
    public static final String WORD_HAS_ONE_CONSONANT_TO_GUESS = "am";

    public HangmanForTest(String word) {
        super(word);
    }

    public void allTriesUsedExceptLast() {
        IntStream.range(0, MAX_TRIES - 1).forEach(i -> type(ANY_CHAR));
    }
}
