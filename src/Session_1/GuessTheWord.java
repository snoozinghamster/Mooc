package Session_1;

import java.util.Objects;
import java.util.Scanner;

public class GuessTheWord{
    public static void main(String[]args){
        System.out.println("Hello, Welcome to Guess the Word. " +
                "Please enter your name");
        Scanner getUserValue=new Scanner(System.in);
        String username=getUserValue.next();
        System.out.println("Please guess the word that i am thinking of");
        String userGuess=getUserValue.next();
        getUserValue.close();

        String answer="Tree";
        boolean finalAnswer=Objects.equals(userGuess,answer);
        System.out.println(username+" you said: "+userGuess+" That is "+finalAnswer);


    }
}