package cn.codingstyle.hangman;

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
        return "_o__";
    }

    public void type(char c) {
        appendCharToUsed(c);
        decreaseTries(c);
    }

    private void decreaseTries(char c) {
        if (isCharNotContained(c))
            tries--;
    }

    private boolean isCharNotContained(char c) {
        return word.indexOf(c) == -1;
    }

    private void appendCharToUsed(char c) {
        if (isCharNotUsed(c))
            used += String.valueOf(c);
    }

    private boolean isCharNotUsed(char c) {
        return used.indexOf(c) == -1;
    }
}
