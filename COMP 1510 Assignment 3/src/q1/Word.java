/**
 * 
 */
package q1;

/**
 * <p>
 * Word object, including a frequency variable.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Word implements Comparable<Word> {
    /** Hold the word. */
    private final String word;
    /** Hold the frequency. */
    private int frequency;

    /**
     * Constructs a word object by defining the word.
     * @param word
     *            a string for word
     */
    public Word(String word) {
        this.word = word;
        frequency = 1;
    }

    /**
     * Accessor for the word.
     * @return String as the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Accessor for the word's frequency.
     * @return integer as frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * Add one in frequency variable.
     */
    public void addOne() {
        frequency++;
    }

    /**
     * Returns a String representation of this Word.
     * @return String representation of this Word.
     */
    public String toString() {
        return word + ":\t" + frequency;
    }
    
    /**
     * Compares this Word with the specified Word for order.
     * @param other
     *            a string for word
     * @return integer 
     * if the specified Word's frequency is larger, return positive,
     * if it's smaller, return negative, and if they are equal, return 0.
     */
    public int compareTo(Word other) {
        Integer thisInteger = new Integer(this.getFrequency());
        Integer otherInteger = new Integer(other.getFrequency());
        return otherInteger.compareTo(thisInteger);
    }
    
    
    
    
    
    
    
}
