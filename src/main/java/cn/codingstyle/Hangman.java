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

    public void type(char c) {
        appendCharToUsed(c);
        decreaseTries(c);
    }

    private void appendCharToUsed(char c) {
        if (isCharUsed(c))
            used += c;
    }

    private void decreaseTries(char c) {
        if (isVowel(c) || isCharContained(c))
            tries--;
    }

    private boolean isVowel(char c) {
        return ALL_VOWELS.indexOf(c) != -1;
    }

    private boolean isCharContained(char c) {
        return word.indexOf(c) == -1;
    }

    private boolean isCharUsed(char c) {
        return used.indexOf(c) == -1;
    }

    public int tries() {
        return tries;
    }
}
