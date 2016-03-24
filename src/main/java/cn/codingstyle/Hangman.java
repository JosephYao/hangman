package cn.codingstyle;

public class Hangman {
    private static final String ALL_VOWELS = "aeiou";
    private final String word;
    private String used = ALL_VOWELS;

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
        if (isCharUsed(c))
            used += c;
    }

    private boolean isCharUsed(char c) {
        return used.indexOf(c) == -1;
    }

    public int tries() {
        return 12;
    }
}
