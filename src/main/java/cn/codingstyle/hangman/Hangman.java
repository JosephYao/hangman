package cn.codingstyle.hangman;

public class Hangman {
    private static final String ALL_VOWEL = "aeiou";
    private static final int MAX_TRIES = 12;
    private final String word;
    private int tries = MAX_TRIES;
    private String used = ALL_VOWEL;

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

    private void decreaseTries(char c) {
        if (ALL_VOWEL.indexOf(c) > -1)
            tries--;
    }

    private void appendCharToUsed(char c) {
        if (isCharNotUsed(c))
            used += c;
    }

    private boolean isCharNotUsed(char c) {
        return used.indexOf(c) == -1;
    }

    public int tries() {
        return tries;
    }
}
