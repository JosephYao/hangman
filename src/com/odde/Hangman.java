package com.odde;

import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hangman {
    private final String word;
    private List<Character> typed = allVowels();

    private List<Character> allVowels() {
        return "aeiou".chars()
                .mapToObj(i -> (char)i)
                .collect(toList());
    }

    public Hangman(String word) {
        this.word = word;
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

}
