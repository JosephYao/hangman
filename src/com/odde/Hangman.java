package com.odde;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hangman {
    private static final int MAX_TRIES = 12;
    private static final String ALL_VOWELS = "aeiou";
    private static final String PLACEHOLDER = "_";
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
        return uniqueTypedChars()
                .map(Object::toString)
                .collect(joining());
    }

    public void type(char c, Runnable afterGameOver) {
        typed.add(c);
        if (tries() == 0)
            afterGameOver.run();
    }

    public int tries() {
        return MAX_TRIES - numberOfFailedTypes();
    }

    private int numberOfFailedTypes() {
        return typed.size() - ALL_VOWELS.length() - numberOfCorrectConsonants();
    }

    private int numberOfCorrectConsonants() {
        return (int) uniqueTypedChars()
                .filter(this::isCorrectConsonant)
                .count();
    }

    private Stream<Character> uniqueTypedChars() {
        return typed.stream().distinct();
    }

    private boolean isCorrectConsonant(Character c) {
        return isConsonant(c) && isPartOfWord(c);
    }

    private boolean isPartOfWord(Character c) {
        return word.indexOf(c) >= 0;
    }

    private boolean isConsonant(Character c) {
        return ALL_VOWELS.indexOf(c) == -1;
    }

    public String discovered() {
        return word.chars()
                .mapToObj(this::discoveredChar)
                .collect(joining());
    }

    private String discoveredChar(int i) {
        char c = (char) i;
        if (typed.contains(c))
            return String.valueOf(c);
        else
            return PLACEHOLDER;
    }
}
