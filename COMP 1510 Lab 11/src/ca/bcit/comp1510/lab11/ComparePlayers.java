/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * <p>
 * Drives Player object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class ComparePlayers {

    /**
     * Creates several Player objects and tests the functions.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
               
        Player testPlayer;
        final int playerNumber = 3;
        final int[] numbers = {99, 23, -5};
        for (int i = 0; i < playerNumber; i++) {
            try {
                if (i == 0) {
                    testPlayer = new Player(null, "BCIT", numbers[i]);
                } else if (i == 1) {
                    testPlayer = new Player("jordan", "  ", numbers[i]);
                } else {
                    testPlayer = new Player("jordan", "BCIT", numbers[i]);
                }
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        testPlayer = new Player("jordan", "BCIT", 1);
        testPlayer.getNumber();
       
        
        Scanner scan = new Scanner(System.in);
        Player[] playList = new Player[2];
        String order;
        for (int i = 0; i < 2; i++) {
            scan = new Scanner(System.in);
            if (i == 0) {
                order = "first";
            } else {
                order = "second";
            }
            System.out.println("Please enter " + order + " player's name:");
            String playerUserName = scan.nextLine();
            System.out.println("Please enter " + order 
                    + " player's team name:");
            String playerUserTeam = scan.nextLine();
            System.out.println("Please enter " + order 
                    + " player's jersey number:");
            int playerUserNumber = scan.nextInt();
            playList[i] = new Player(playerUserName, 
                    playerUserTeam, playerUserNumber);
        }
        
        System.out.println("First Player is compared to the second Player:\n" 
                + playList[0].compareTo(playList[1]));
        System.out.println("Are these two plyaer equal?\n" 
                + playList[0].equals(playList[1]));


        scan.close();

    
    }

}
