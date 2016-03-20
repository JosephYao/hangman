package cn.codingstyle.hangman;

import static java.util.stream.Collectors.joining;

public class Hangman {
    private static final String ALL_VOWEL = "aeiou";
    private static final int MAX_TRIES = 12;
    private static final String PLACEHOLDER = "_";
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

    public void type(char c, Runnable gameLost, Runnable gameWin) {
        decreaseTries(c);
        appendCharToUsed(c);
        checkGameLost(gameLost);
        checkGameWin(gameWin);
    }

    private void decreaseTries(char c) {
        if (isCharNotContained(c) || isCharUsed(c))
            tries--;
    }

    private void appendCharToUsed(char c) {
        if (!isCharUsed(c))
            used += c;
    }

    private void checkGameLost(Runnable gameLost) {
        if (allTriesUsed())
            gameLost.run();
    }

    private void checkGameWin(Runnable gameWin) {
        if (allCharsDiscovered())
            gameWin.run();
    }

    private boolean isCharNotContained(char c) {
        return word.indexOf(c) == -1;
    }

    private boolean isCharUsed(char c) {
        return used.indexOf(c) > -1;
    }

    private boolean allTriesUsed() {
        return tries == 0;
    }

    private boolean allCharsDiscovered() {
        return word.equals(discovered());
    }

    public String discovered() {
        return word.chars()
                .mapToObj(i -> discoveredChar((char)i))
                .collect(joining());
    }

    private String discoveredChar(char c) {
        if (isCharUsed(c))
            return String.valueOf(c);
        else
            return PLACEHOLDER;
    }

    public int tries() {
        return tries;
    }
}
