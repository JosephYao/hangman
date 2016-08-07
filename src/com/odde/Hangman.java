package com.odde;

public class Hangman {
    private static final String ALL_VOWELS = "aeiou";
    private final String word;

    public Hangman(String word) {
        this.word = word;
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return ALL_VOWELS;
    }
}
