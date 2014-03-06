package edu.macalester.comp124.wordcounter;

import java.util.Set;

/**
 * A counter that keeps track of counts for all words
 * 
 * @author shilad
 *
 */
public class AllWordsCounter {

    public static final int MAX_WORDS = 10000;


	// TODO: initialize instance variable to hold MAX_WORDS objects
    SingleWordCounter counters[] = new SingleWordCounter[MAX_WORDS];

    public int getNumWords() {
        int count1 = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] != null) {
                count1++;
            } else break;
        }

        // TODO: count the number of distinct words,
        // ie. the number of non-null counter objects.
        return count1;
    }
	
	/**
	 * Increment the count for the specified word.  Remember that this may
     * be the first time the word counter has seen this particular word.
	 * 
	 * @param word
	 */
	public void count(String word) {
        int n = getNumWords();
        for (int i = 0; i < n; i++) {
            if (counters[i].wordMatches(word)) {
                n++;
                return;
            }
            // If you find the word increment the count and return
        } if (counters[n] == null) {
            new SingleWordCounter(word);
            n++;

        }

        // You didn't find the word. Add a new word counter to the array.
        // Don't forget to increment the word's count to get it to 1!
	}
	
	/**
	 * Return the count for the particular word.  Remember that the
	 * word may not have been seen before.
	 * @param word
	 * @return
	 */
	public int getCount(String word) {
        int m = getNumWords();
        for (int i = 0; i < m; i++) {
            if (counters[i].wordMatches(word)) {
                m++;
            } else break;

        } if (counters[m] == null) {
            m = 0;
        }

        // TODO: pattern this after the count() function.
        // Make sure to return 0 for words you haven't seen before.
        return m;
	}
	
	/**
	 * @return The an array of all words that have been counted
	 * (just the words, not the values).
	 */
	public String []  getAllWords() {
        // part one: create an array of strings of size equal to the number of words
        int n = getNumWords();
        String words[] = new String[n];  // FIXME
        for (int i = 0; i < words.length; i++) {

        }

        // part two: fill the array of strings using a loop

        return words;
	}
}
