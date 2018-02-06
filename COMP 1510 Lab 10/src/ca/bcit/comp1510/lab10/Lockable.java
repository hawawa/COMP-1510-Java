/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Interface class that has some function as a lock.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public interface Lockable {
    /**
     * Set the key.
     * @param key
     *            a integer for the key
     */
    void setKey(int key);
    
    /**
     * Locks this object.
     * @param key
     *            a integer for the key
     * @return boolean if this object is locked
     */
    boolean lock(int key);
    
    /**
     * Unlocks this object.
     * @param key
     *            a integer for the key
     * @return boolean if this object is unlocked
     */
    boolean unlock(int key);
    
    /**
     * Return if this object is locked.
     * @return boolean if this object is locked.
     */
    boolean locked();
    
    
    

}
