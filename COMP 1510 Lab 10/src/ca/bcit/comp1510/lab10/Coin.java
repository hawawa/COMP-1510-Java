package ca.bcit.comp1510.lab10;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Chih-Chih Chang
 * @version 3.0
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /** Key for the lock. */
    private int key;
    
    /** If this object is locked. */
    private boolean locked = true;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!locked) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("This Coin object is locked. No flip!");
        }
        
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return (face == HEADS);
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        
        return faceName;
    }

    @Override
    /**
     * Set the key.
     * @param key
     *            a integer for the key
     */
    public void setKey(int key) {
        this.key = key;
        
    }

    @Override
    /**
     * Locks this object.
     * @param enterKey
     *            a integer for the key
     * @return boolean if this object is locked
     */
    public boolean lock(int enterKey) {
        if (enterKey == this.key) {
            locked = true;
            return true;
        }
        return false;
    }

    /**
     * Unlocks this object.
     * @param enterKey
     *            a integer for the key
     * @return boolean if this object is unlocked
     */
    public boolean unlock(int enterKey) {
        if (enterKey == this.key) {
            locked = false;
            return true;
        }
        return false;
    }

    @Override
    /**
     * Return if this object is locked.
     * @return boolean if this object is locked.
     */
    public boolean locked() {
        return locked;

    }
}

