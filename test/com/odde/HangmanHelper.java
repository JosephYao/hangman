package com.odde;

public class HangmanHelper extends Hangman {
    public static final char VOWEL = 'a';
    public static final char CORRECT_CONSONANT = 'w';
    public static final char WRONG_CONSONANT = 'b';
    public static final char CONSONANT = WRONG_CONSONANT;
    public static final int MAX_TRIES = 12;
    public static final char ANY_CHAR = 'x';
    public static final Runnable WHAT_EVER = () -> {};

    public HangmanHelper(String word) {
        super(word);
    }

    public void typeButNotCareGameOverOrWin(char c) {
        type(c, WHAT_EVER, WHAT_EVER);
    }
}
