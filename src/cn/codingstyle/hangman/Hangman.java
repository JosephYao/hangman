package cn.codingstyle.hangman;

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

    public int tries() {
        return 12;
    }

    public String used() {
        return used;
    }

    public String discovered() {
        return "_o__";
    }

    public void type(char c) {
        if (isCharNotUsed(c))
            used += String.valueOf(c);
    }

    private boolean isCharNotUsed(char c) {
        return used.indexOf(c) == -1;
    }
}
