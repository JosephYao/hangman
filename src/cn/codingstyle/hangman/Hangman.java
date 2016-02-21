package cn.codingstyle.hangman;

public class Hangman {
    private final String word;

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
        return "aeiou";
    }

    public String discovered() {
        return "_o__";
    }

    public void type(char c) {

    }
}
