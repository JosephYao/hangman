public class Hangman {
    private static final int MAX_TRIES = 12;
    private final String word;
    private int tries = MAX_TRIES;

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
        return "aeiou";
    }

    public String discovered() {
        return "w_rd";
    }

    public void type(char c) {
        if (tries > 0)
            tries--;
    }

    public void whenGameOver(Runnable whenGameOver) {
        if (tries == 0)
            whenGameOver.run();
    }
}
