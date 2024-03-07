package session_3;

import java.util.Objects;
import java.util.Scanner;

public class demo2 {
    public static void main(String[]args){
        System.out.println("Hello, Welcome to Guess the Word. " +
                "Please enter your name");
        Scanner getUserValue=new Scanner(System.in);
        String username=getUserValue.next();

        int targetVal = 7;
        int guess = 0;


        while (targetVal != guess) {
            System.out.println("Please guess the number that i am thinking of");
            guess = getUserValue.nextInt();
            if (guess < targetVal){
                System.out.println("too low!");
            }
            else if (guess > targetVal){
                System.out.println("too high");
            }


        }
        System.out.println("well done!");


    }
}

