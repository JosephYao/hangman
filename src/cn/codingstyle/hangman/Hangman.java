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

    public void type(char c, Runnable gameOver) {
        reduceTries(c);
        appendCharToUsed(c);
        runIfGameOver(gameOver);
    }

    private Stream<Character> charsOfWord() {
        return word.chars().mapToObj(i -> (char)i);
    }

    private String discoveredEachChar(char c) {
        if (isCharUsed(c))
            return String.valueOf(c);
        else
            return "_";
    }

    private boolean isCharUsed(char c) {
        return used.indexOf(c) > -1;
    }

    private void runIfGameOver(Runnable gameOver) {
        if (!canTry())
            gameOver.run();
    }

    private void appendCharToUsed(char c) {
        if (!isCharUsed(c))
            used += String.valueOf(c);
    }

    private void reduceTries(char c) {
        if (canTry() && isCharNotContained(c))
            tries--;
    }

    private boolean isCharNotContained(char c) {
        return word.indexOf(c) == -1;
    }

    private boolean canTry() {
        return tries > 0;
    }

}
