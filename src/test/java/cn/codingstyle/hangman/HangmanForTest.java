package cn.codingstyle.hangman;

public class HangmanForTest extends Hangman {
    public HangmanForTest(String word) {
        super(word);
    }

    public void typeWithoutCheckGameLost(char c) {
        type(c, () -> {});
    }
}
