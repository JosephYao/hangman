package cn.codingstyle;

public class Hangman {
    private static final String ALL_VOWEL = "aeiou";
    private final String word;
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
        if (isConsonant(c))
            used += c;
    }

    private boolean isConsonant(char c) {
        return ALL_VOWEL.indexOf(c) == -1;
    }
}
