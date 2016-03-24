package cn.codingstyle;

public class Hangman {
    private final String word;

    public Hangman(String word) {
        this.word = word;
    }

    public int length() {
        return word.length();
    }

    public String used() {
        return "aeiou";
    }
}
