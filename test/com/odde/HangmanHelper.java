package com.odde;

public class HangmanHelper extends Hangman {
    public static final char VOWEL = 'a';
    public static final char CORRECT_CONSONANT = 'w';
    public static final char WRONG_CONSONANT = 'b';
    public static final char CONSONANT = WRONG_CONSONANT;

    public HangmanHelper(String word) {
        super(word);
    }
}
