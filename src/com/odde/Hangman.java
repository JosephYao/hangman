package com.odde;

public class Hangman {
    private static final String ALL_VOWELS = "aeiou";
    private final String word;
    private String typed = "";

    public Hangman(String word) {
        this.word = word;
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return ALL_VOWELS + typed;
    }

    public void type(char c) {
        if (isConsonant(c))
            typed += c;
    }

    private boolean isConsonant(char c) {
        return ALL_VOWELS.indexOf(c) < 0;
    }
}
