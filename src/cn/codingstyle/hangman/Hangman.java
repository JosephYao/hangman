package cn.codingstyle.hangman;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Hangman {
    private static final int MAX_TRIES = 12;
    private final String word;
    private int tries = MAX_TRIES;
    private String used = "aeiou";

    public Hangman(String word) {
        this.word = word;
    }

    public int length() {
        return word.length();
    }

    public int tries() {
        return tries;
    }

    public String used() {
        return used;
    }

    public String discovered() {
        return charsOfWord()
                .map(this::discoveredEachChar)
                .collect(joining());
    }

    private Stream<Character> charsOfWord() {
        return word.chars().mapToObj(i -> (char)i);
    }

    private String discoveredEachChar(char c) {
        if (isCharDiscovered(c))
            return String.valueOf(c);
        else
            return "_";
    }

    private boolean isCharDiscovered(char c) {
        return used.indexOf(c) > -1;
    }

    public void type(char c, Runnable gameOver) {
        reduceTries();
        appendCharToUsed(c);
        runIfGameOver(gameOver);
    }

    private void runIfGameOver(Runnable gameOver) {
        if (tries == 0)
            gameOver.run();
    }

    private void appendCharToUsed(char c) {
        if (used.indexOf(c) == -1)
            used += String.valueOf(c);
    }

    private void reduceTries() {
        if (tries > 0)
            tries--;
    }

}
