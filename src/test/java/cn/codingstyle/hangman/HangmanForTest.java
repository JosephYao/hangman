package cn.codingstyle.hangman;

public class HangmanForTest extends Hangman {
    public static final char NOT_CONTAINED_CONSONANT = 'z';
    public static final char NOT_CONTAINED_VOWEL = 'a';
    public static final char CONTAINED_CONSONANT = 'w';
    public static final char CONTAINED_VOWEL = 'o';
    public static final String ALL_VOWEL = "aeiou";
    public static final char VOWEL = 'a';
    public static final char CONSONANT = 'b';

    public HangmanForTest(String word) {
        super(word);
    }

    public void typeWithoutCheckGameLost(char c) {
        type(c, () -> {});
    }
}
