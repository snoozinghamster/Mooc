package session_2;

import java.util.Objects;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[]args){
        System.out.println("Hello, Welcome to Guess the Word. " +
                "Please enter your name");
        Scanner getUserValue=new Scanner(System.in);
        String username=getUserValue.next();
        System.out.println("Please guess the word that i am thinking of");
        String userGuess=getUserValue.next();
        getUserValue.close();
        String answer="Tree";
        String killWord = "Boo";

        if (userGuess.equalsIgnoreCase(answer)){
            System.out.println(username+" you said: "+userGuess+" That is Correct!");
        } else if (Objects.equals(userGuess,killWord)){
            System.out.println(username+" you said: "+userGuess+" Game Over!");
        }
        else{
            System.out.println(username+" you said: "+userGuess+" not quite right");
        }


    }
}
