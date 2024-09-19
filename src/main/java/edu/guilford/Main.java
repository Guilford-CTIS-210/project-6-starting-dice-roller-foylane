package edu.guilford;
// Foy Lane 9/19/24
import java.util.Random; // allows us to use random commands from library not on basic java 
import java.util.Scanner;// same things but for scanner 

public class Main {
    public static Random rand = new Random(); // new variable called rand 
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // new variable called for scanner called scan that can read input from user 
        System.out.print("You are going to roll a 10 dice; How many sides should the dice have?");
        int sides = scan.nextInt(); // new interger called sides reads and stores input from user 
        System.out.print("How many dice do you wanna roll");
        int number = scan.nextInt(); // new integer called number that reads and stores input from user 
        int sum = 0; // variable keeps track of dice rolls 
        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) { //conditions for for loop start at zero, less than number, add 1 
            int diceRoll = rand.nextInt(1,sides); // new integer between 1 and sides 
            sum += diceRoll; // add dice role to value of sums 
            //System.out.println("sum of" + i + "d" + sides + "=" + sum); 
        System.out.println("Rolling " + number + "d" + sides + "=" + sum); // prints final result 
    scan.close();
    }
}
}