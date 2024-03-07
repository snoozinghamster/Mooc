package session_3;
import java.util.Scanner;

class Game{
    private int targetNumber;


    public Game(){
        targetNumber = (int) (Math.random() * 100) + 1;
    }

    public void startGame() {
        System.out.println("New Game!");
    }

    public boolean checkGuess(int guess){
        return  guess == targetNumber;
    }
    public int getTargetNumber(){
        return targetNumber;
    }
}

class Player{
    private String name;

    public  Player(String playerName){
        this.name = playerName;
    }


    public  String getName() {
        return name;
    }
}

public class guessing_game {
    public static void main(String[] args){
        int score = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String username=scanner.next();
        Player player = new Player(username);
        System.out.println("Welcome to the Guessing game, " + player.getName() + "!\n Try to guess the number between 1 and 100");
        Game game = new Game();
        game.startGame();

        int guess;
        do {
            guess = scanner.nextInt();
            if (game.checkGuess(guess)){
                System.out.println("Congratulations! You guessed correctly!");
                System.out.println("It took you " + score + " tries!");
                break;
            } else {
                score += 1;
                if (guess < game.getTargetNumber()){
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too High! Try again.");
                }
            }

        } while (true);
        scanner.close();
    }
}
