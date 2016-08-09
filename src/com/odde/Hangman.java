package com.odde;

import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hangman {
    private static final int MAX_TRIES = 12;
    private static final String ALL_VOWELS = "aeiou";
    private final String word;
    private List<Character> typed = allVowels();

    public Hangman(String word) {
        this.word = word;
    }

    private List<Character> allVowels() {
        return ALL_VOWELS.chars()
                .mapToObj(i -> (char)i)
                .collect(toList());
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return typed.stream()
                .distinct()
                .map(Object::toString)
                .collect(joining());
    }

    public void type(char c) {
        typed.add(c);
    }

    public int tries() {
        return MAX_TRIES - numberOfFailedTypes();
    }

    private int numberOfFailedTypes() {
        return typed.size() - ALL_VOWELS.length() - numberOfConsonant();
    }

    private int numberOfConsonant() {
        return (int) typed.stream()
                .filter(this::isConsonant)
                .count();
    }

    private boolean isConsonant(Character c) {
        return ALL_VOWELS.indexOf(c) == -1;
    }
}
