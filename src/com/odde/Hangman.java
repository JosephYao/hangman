package com.odde;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Hangman {
    private static final String ALL_VOWELS = "aeiou";
    private final String word;
    private List<Character> typed = new ArrayList<>();

    public Hangman(String word) {
        this.word = word;
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return ALL_VOWELS + typedConsonants();
    }

    private String typedConsonants() {
        return typed.stream()
                .filter(this::isConsonant)
                .map(Object::toString)
                .collect(joining());
    }

    public void type(char c) {
        typed.add(c);
    }

    private boolean isConsonant(char c) {
        return ALL_VOWELS.indexOf(c) < 0;
    }
}
