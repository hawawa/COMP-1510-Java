/**
 * 
 */
package ca.bcit.comp1510.lab11;


/**
 * <p>
 * Represents a player which includes the name, team name and number.
 * This class implements Comparable.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Player implements Comparable<Player> {
    /** Player name. */
    private final String name;
    /** Team name. */
    private final String teamName;
    /** Number. */
    private final int number;
        
    /**
     * Constructs a player by defining name, team name and number.
     * Name and team name should not be null or only white space.
     * Jersey number should not be 0 or negative.
     * @param name
     *            a string for player name
     * @param teamName
     *            a string for team name
     * @param number
     *            a integer for jersey number
     */
    public Player(String name, String teamName, int number) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("The player's name "
                    + "should not be null or whitespace!");
        } else if (teamName == null || teamName.trim().isEmpty()) {
            throw new IllegalArgumentException("The player's team name "
                    + "should not be null or whitespace!");
        } else if (number <= 0) {
            throw new IllegalArgumentException("The player's number "
                    + "should not be 0 or negative!");
        } else {
            this.name = name;
            this.teamName = teamName;
            this.number = number;
        }
    }
    
    /**
     * Accessor for player name.
     * @return String as player name
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for team name.
     * @return String as team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Accessor for jersey number.
     * @return integer as jersey number
     */
    public int getNumber() {
        return number;
    }
    

    /**
     * Compare one player with another player by their jersey numbers.
     * @param other
     *            another player object
     * @return integer 
     *              If their jersey numbers are equal, return 0.
     *              If this jersey number is less than 
     *              the argument's jersey number, return -1.
     *              If this jersey number is greater than 
     *              the argument's jersey number, return 1.
     */
    public int compareTo(Player other) {
        return (this.getNumber() < other.getNumber()) ? -1 
                : ((this.getNumber() == other.getNumber()) ? 0 : 1);
    }

    /**
     * Returns a String representation of this player.
     * @return String representation of this player.
     */
    @Override
    public String toString() {
        return "Player [name=" + name + ", teamName=" + teamName 
                + ", number=" + number + "]";
    }
    
    /**
     * Checks if two Player object is equal.
     * @param other another Object.
     * @return boolean 
     *          If they are equal, return true.
     *          If they are not equal, return false.
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this == other) {
            return true;
        } else if (!getClass().equals(other.getClass())) {
            return false;
        } else {
            return this.getName().equals(((Player) other).getName()) 
            && this.getTeamName().equals(((Player) other).getTeamName()) 
            && this.getNumber() == ((Player) other).getNumber();
        }
          
    }

}
