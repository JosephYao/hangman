package cn.codingstyle.hangman;

public class HangmanHelper extends Hangman {
    public static final int MAX_TRIES = 12;
    public static final char NOT_CONTAINED_CHAR = 'z';

    public HangmanHelper(String word) {
        super(word);
    }

    public void typeButNotCheckGameOver(char c) {
        type(c, ()->{});
    }
}
