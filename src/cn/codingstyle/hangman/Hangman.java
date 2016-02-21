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
        decreaseTries(c);
        appendCharToUsed(c);
    }

    public void type(char c, Runnable gameOver) {

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
