/**
 * 
 */
package ca.bcit.comp1510.lab8;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * <p>
 * avoids forbidden words as the password.
 * </p>
 * @author Chih-Hsi Chang
 * @version 1.0
 * 
 */
public class ForbiddenWords {
    /** Holds the forbidden word list. */
    private ArrayList<String> wordList;
    /** Holds the file scanner. */
    private Scanner fileScanner;
    
    /**
     * Constructs a ForbiddenWords object by defining its file name.
     * @throws IOException if there is an error reading the file.
     * @param fileName
     *            a string for file name
     */
    public ForbiddenWords(String fileName) throws IOException {
        wordList = new ArrayList<String>();
        fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNext()) {
            wordList.add(fileScanner.nextLine());
        }
    }
    
    /**
     * <p>
     * Checks if the enter target is in the forbidden word list.
     * <p>
     * @param target the target String which need to be checked
     * @return boolean
     */  
    public boolean containsWord(String target) {
        return wordList.contains(target);
    }

}
