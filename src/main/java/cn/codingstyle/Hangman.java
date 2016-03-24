package cn.codingstyle;

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

    public String used() {
        return used;
    }

    public void type(char c, Runnable gameOver) {
        decreaseTries(c);
        appendCharToUsed(c);
    }

    private void decreaseTries(char c) {
        if (isCharUsed(c) || !isCharContained(c))
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
        return word.indexOf(c) != -1;
    }

    public int tries() {
        return tries;
    }
}
