package com.shubh.random;

public class WordsCount {

    private static WordsCount WORDSCOUNTINSTANCE = null;

    private WordsCount() {
    }

    public static WordsCount getInstance() {

        if (WORDSCOUNTINSTANCE == null) {
            synchronized (WordsCount.class) {
                if (WORDSCOUNTINSTANCE == null) {
                    WORDSCOUNTINSTANCE = new WordsCount();
                }
            }
        }

        return WORDSCOUNTINSTANCE;
    }
}
