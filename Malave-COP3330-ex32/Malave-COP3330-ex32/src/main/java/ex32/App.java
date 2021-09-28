package ex32;
import java.util.*;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        Scanner in  = new Scanner(System.in);
        int levels = 0;
        int level1_boundary = 10;
        int level2_boundary = 100;
        int level3_boundary = 1000;
        int guess = 0;
        int wrong;
        char answer = 'Y';
        System.out.println( "Let's play Guess the Number!" );

        while (answer == 'Y' || answer == 'y')
        {
            while (levels != 1 || levels != 2 || levels != 3) {
                System.out.println("Enter the difficulty level (1, 2, or 3):");
            }

            wrong = 0;

            if (levels == 1)
            {
                int int_random = rand.nextInt(level1_boundary) + 1;
                System.out.println("I have my number. What's your guess?");
                while ( guess != int_random)
                {
                    guess = in.nextInt();
                    if (guess > int_random){
                        System.out.println("Too high. Guess again:");
                        wrong++;
                    }
                    else
                    {
                        System.out.println("Too low. Guess again:");
                        wrong++;
                    }
                }
            }
            else if (levels == 2)
            {
                int int_random = rand.nextInt(level2_boundary) + 1;
                System.out.println("I have my number. What's your guess?");
                while ( guess != int_random)
                {
                    guess = in.nextInt();
                    if (guess > int_random){
                        System.out.println("Too high. Guess again:");
                        wrong++;
                    }
                    else
                    {
                        System.out.println("Too low. Guess again:");
                        wrong++;
                    }
                }
            }
            else if (levels == 3)
            {
                int int_random = rand.nextInt(level3_boundary) + 2;
                System.out.println("I have my number. What's your guess?");
                while ( guess != int_random)
                {
                    guess = in.nextInt();
                    if (guess > int_random){
                        System.out.println("Too high. Guess again:");
                        wrong++;
                    }
                    else
                    {
                        System.out.println("Too low. Guess again:");
                        wrong++;
                    }
                }
            }


            System.out.println("You got it in " + wrong + " guesses!");
            System.out.println("Do you wish to play again (Y/N)?");
            answer = in.next().charAt(0);
        }
    }
}
