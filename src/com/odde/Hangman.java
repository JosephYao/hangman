package com.odde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Hangman {
    private static final int MAX_TRIES = 12;
    private static final String ALL_VOWELS = "aeiou";
    private static final String PLACEHOLDER = "_";
    private final String word;
    private List<String> typed = allVowels();

    public Hangman(String word) {
        this.word = word;
    }

    private List<String> allVowels() {
        return new ArrayList<>(Arrays.asList(ALL_VOWELS.split("")));
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return uniqueTypedChars()
                .collect(joining());
    }

    public void type(char c, Runnable afterGameOver) {
        typed.add(String.valueOf(c));
        if (tries() == 0)
            afterGameOver.run();
    }

    public int tries() {
        return MAX_TRIES - numberOfWrongTypes();
    }

    private int numberOfWrongTypes() {
        return typed.size() - ALL_VOWELS.length() - numberOfCorrectConsonants();
    }

    private int numberOfCorrectConsonants() {
        return (int) uniqueTypedChars()
                .filter(this::isCorrectConsonant)
                .count();
    }

    private Stream<String> uniqueTypedChars() {
        return typed.stream().distinct();
    }

    private boolean isCorrectConsonant(String c) {
        return isConsonant(c) && isPartOfWord(c);
    }

    private boolean isPartOfWord(String c) {
        return word.contains(c);
    }

    private boolean isConsonant(String c) {
        return !ALL_VOWELS.contains(c);
    }

    public String discovered() {
        return Arrays.stream(word.split(""))
                .map(this::discoveredChar)
                .collect(joining());
    }

    private String discoveredChar(String c) {
        return typed.contains(c) ? c : PLACEHOLDER;
    }
}
