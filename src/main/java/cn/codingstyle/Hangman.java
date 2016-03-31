package cn.codingstyle;

import static java.util.stream.Collectors.joining;

public class Hangman {
    private static final String ALL_VOWEL = "aeiou";
    private static final int MAX_TRIES = 12;
    private static final String PLACEHOLDER = "_";
    private final String word;
    private final Judge judge;
    private String used = ALL_VOWEL;
    private int tries = MAX_TRIES;

    public Hangman(String word) {
        this.word = word;
        judge = new Judge(this, word);
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return used;
    }

    public Judge type(char c) {
        decreaseTries(c);
        appendCharToUsed(c);
        return judge;
    }

    private void decreaseTries(char c) {
        if (isCharUsed(c) || isCharContained(c))
            tries--;
    }

    private void appendCharToUsed(char c) {
        if (!isCharUsed(c))
            used += c;
    }

    private boolean isCharUsed(char c) {
        return used.indexOf(c) != -1;
    }

    private boolean isCharContained(char c) {
        return word.indexOf(c) == -1;
    }

    public String discovered() {
        return word.chars()
                .mapToObj(i -> discoveredChar((char)i))
                .collect(joining());
    }

    private String discoveredChar(char c) {
        if (isCharUsed(c))
            return String.valueOf(c);
        else
            return PLACEHOLDER;
    }

    public int tries() {
        return tries;
    }
}
