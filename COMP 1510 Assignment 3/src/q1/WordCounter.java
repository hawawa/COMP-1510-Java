package q1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * <p>
 * Counts how many specific words in bible.txt and their frequency.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class WordCounter {
    /** Hold the Word ArrayList. */
    private ArrayList<Word> wordList = new ArrayList<Word>();
    
    /**
     * Inputs the file's words into Word ArrayList 
     * and counts how many specific word.
     * 
     * @param fileName
     *            the file name
     * @throws IOException
     *            avoiding wrong file name
     * @return integer as how many specific words
     */
    public int parseBook(String fileName) throws IOException {
        File myFile = new File(fileName);
        Scanner fileScan = new Scanner(myFile);
        Word newWord;
        String thisWord;
        boolean repeat;
        
        while (fileScan.hasNext()) {
            thisWord = fileScan.next();
            repeat = false;
            for (Word myWord : wordList) {
                if (myWord.getWord().equalsIgnoreCase(thisWord)) {
                    myWord.addOne();
                    repeat = true;
                    break;
                }
            }    
            
            if (!repeat) {
                newWord = new Word(thisWord);
                wordList.add(newWord);
            }
                       
        }
        
        fileScan.close();
        return wordList.size();
    }
    
    /**
     * Prints the top nth frequency words. 
     * 
     * @param n
     *            how many top frequency words need to return
     */
    public void printTopWords(int n) {
        if (n < 1 || n > wordList.size()) {
            throw new ArrayIndexOutOfBoundsException("The input for "
                    + "printTopWords method should be between 0 and " 
                    + wordList.size() + ".");
        }
        wordList.sort(null);
        for (int i = 0; i < n; i++) {
            System.out.println(wordList.get(i).toString());
        }
    }   
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        WordCounter myWordCounter = new WordCounter();
        
        try {
            System.out.println("The total number of unique Words: " 
                    + myWordCounter.parseBook("." + File.separator + "src" 
                            + File.separator + "bible.txt"));
            final int nth = 10;
            myWordCounter.printTopWords(nth);
        } catch (IOException e) {
            System.out.println("Can't find the file!");
        }
           
        System.out.println("Question one was called and ran sucessfully.");
    }
    

    

    

};
