/**
 * 
 */
package ca.bcit.comp1510.lab7;
import java.util.Scanner;
import java.util.Random;

/**
 * <p>
 * Some fun games.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Games {
    /** Hold user's score. */
    private int userScore;
    /** Hold a Scanner object. */
    private Scanner scan;
    /** Hold a Random object. */
    private Random generator;
    
    /** 
     * Constructor initials user score and creates Scanner and Random object.
     */
    public Games() {
        userScore = 0;
        scan = new Scanner(System.in);
        generator =  new Random();
    }
    
    /**
     * sets up a play menu.
     */
    public void play() {
        int userChoice;
        final int choice1 = 1;
        final int choice2 = 2;
        final int choice3 = 3;
        final int choice4 = 4;
        
        do {
            System.out.println("Welcome to the Games Program!");
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            userChoice = scan.nextInt();
            if (userChoice == choice1) {
                System.out.println("Your score is " + userScore + ".");
            } else if (userChoice == choice2) {
                guessANumber();
            } else if (userChoice == choice3) {
                rockPaperScissors();
            } else if (userChoice != choice4) {
                System.out.println("That's not a valid choice!");
            }
        } while (userChoice != choice4);
        
    }
    
    /**
     * Sets up the guess a number game.
     */
    public void guessANumber() {
        final int generatorNumber = 101;
        int pickedNumber = generator.nextInt(generatorNumber);
        int time = 0;
        int guessNumber;
        final int getScoreTimes = 5;
        final int getScore = 5;
        
        System.out.println("I've picked a random number between 0 and 100.");
        System.out.println("Can you guess it?");
        
        do {
            System.out.println("Guess the number!");
            guessNumber = scan.nextInt();
            if (guessNumber > pickedNumber) {
                System.out.println("Too high, guess again!");
                time++;
            } else if (guessNumber < pickedNumber) {
                System.out.println("Too low, guess again!");
                time++;
            } else {
                time++;
            }
        } while (guessNumber != pickedNumber);
        
        System.out.println("RIGHT!");
        
        if (time <= getScoreTimes) {
            System.out.println("Five points!");
            userScore += getScore;
        } else {
            System.out.println("More than 5 times.");
        }
        
    }
    
    /**
     * Sets up ROCK, PAPER, SCISSORS game.
     */
    public void rockPaperScissors() {
        final int numberRPS = 3;
        int pickedRPS = generator.nextInt(numberRPS);
        String myRPS = null;
        String userRPS;
        boolean valid;
        final int getScore = 5;
        final int lossScore = 3;
        
        switch (pickedRPS) {
        case 0:
            myRPS = "ROCK";
            break;
        case 1:
            myRPS = "PAPER";
            break;
        case 2:
            myRPS = "SCISSORS";
            break;
        default:
        }
        
        do {
            System.out.println("I've picked one of ROCK, PAPER, and SCISSORS.");
            System.out.println("Which one do you choose?");
            userRPS = scan.next();
            userRPS = userRPS.toUpperCase();
            if (userRPS.equals("ROCK") 
                    || userRPS.equals("PAPER") 
                    || userRPS.equals("SCISSORS")) {
                valid = true;
            } else {
                valid = false;
                System.out.println("That's not a valid choice! Try again!");
            }
        } while (!valid);
        
        if ((pickedRPS == 0 && userRPS.equals("PAPER")) 
                || (pickedRPS == 1 && userRPS.equals("SCISSORS")) 
                || (pickedRPS == 2 && userRPS.equals("ROCK"))) {
            System.out.println("YES! You win!!");
            userScore += getScore;
        } else if ((pickedRPS == 0 && userRPS.equals("SCISSORS")) 
                || (pickedRPS == 1 && userRPS.equals("ROCK")) 
                || (pickedRPS == 2 && userRPS.equals("PAPER"))) {
            System.out.println("Nope. I picked up " + myRPS);
            userScore -= lossScore;
        } else {
            System.out.println("Tied. I picked up " + myRPS + ", too.");
        }
    }
        
}
