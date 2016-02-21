package cn.codingstyle.hangman;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Hangman {
    private static final String ALL_VOWELS = "aeiou";
    private static final int MAX_TRIES = 12;
    private final String word;
    private String used = ALL_VOWELS;
    private int tries = MAX_TRIES;

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
                .map(this::discoveredChar)
                .collect(joining());
    }

    private Stream<Character> charsOfWord() {
        return word.chars().mapToObj(i -> (char)i);
    }

    private String discoveredChar(char c) {
        if (used.indexOf(c) > -1)
            return String.valueOf(c);
        else
            return "_";
    }

    public void type(char c, Runnable gameOver) {
        decreaseTries(c);
        appendCharToUsed(c);
        runIfGameOver(gameOver);
    }

    private void runIfGameOver(Runnable gameOver) {
        if (!canTryMore())
            gameOver.run();
    }

    private void decreaseTries(char c) {
        if ((isCharNotContained(c) || isCharUsed(c)) && canTryMore())
            tries--;
    }

    private boolean canTryMore() {
        return tries > 0;
    }

    private boolean isCharNotContained(char c) {
        return word.indexOf(c) == -1;
    }

    private void appendCharToUsed(char c) {
        if (!isCharUsed(c))
            used += String.valueOf(c);
    }

    private boolean isCharUsed(char c) {
        return used.indexOf(c) > -1;
    }

}
