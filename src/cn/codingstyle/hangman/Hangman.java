package cn.codingstyle.hangman;

public class Hangman {
    private static final int MAX_TRIES = 12;
    private final String word;
    private int tries = MAX_TRIES;
    private String used = "aeiou";

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
        return word;
    }

    public void type(char c) {
        reduceTries();
        appendCharToUsed(c);
    }

    private void appendCharToUsed(char c) {
        if (used.indexOf(c) == -1)
            used += String.valueOf(c);
    }

    private void reduceTries() {
        if (tries > 0)
            tries--;
    }

    public void whenGameOver(Runnable whenGameOver) {
        if (tries == 0)
            whenGameOver.run();
    }
}
