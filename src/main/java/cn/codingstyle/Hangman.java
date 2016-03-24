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
        if (ALL_VOWELS.indexOf(c) == -1)
            used += c;
    }
}
