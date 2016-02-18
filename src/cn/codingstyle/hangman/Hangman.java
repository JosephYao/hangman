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
        if (used.contains(word)) {
            return word;
        } else {
            return "_";
        }
    }

    public void type(char c, Runnable gameOver) {
        reduceTries();
        appendCharToUsed(c);
        runIfGameOver(gameOver);
    }

    private void runIfGameOver(Runnable gameOver) {
        if (tries == 0)
            gameOver.run();
    }

    private void appendCharToUsed(char c) {
        if (used.indexOf(c) == -1)
            used += String.valueOf(c);
    }

    private void reduceTries() {
        if (tries > 0)
            tries--;
    }

}
