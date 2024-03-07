package my_try;

class Game{
    private int targetNumber;
    public int guess;
    private int score;
    public Game(){
        targetNumber = (int) (Math.random() * 100) + 1;
    }
    public void startGame() {
        System.out.println("New Game! Try to guess the number between 1 and 100\n");
        score = 0;
        System.out.println("test");
        do { //loops through on a game until guesses correctly, increasing score by 1 each time, loops continually until a correct guess is made.
            guess = ScannerUtil.getConsoleScanner().nextInt();
            score ++;
            if (this.checkGuess(guess)){//use this.checkGuess as the method is part of the class
                System.out.println("Congratulations! You guessed correctly!");
                System.out.println("It took you " +score + " tries!");
                break;
            } else {
                if (guess < this.getTargetNumber()){
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too High! Try again.");
                }
            }
        } while (true);
    }
    public boolean checkGuess(int guess){
        return  guess == targetNumber;
    } //method to check the guess
    public int getTargetNumber(){
        return targetNumber;
    } //getter - allows us to access target number outside of the class

    public int getScore() {return score;} //getter for the score - could lead into a score tracker storing the scores outside of this class
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
        //gets the player info only once and welcomes the user
        String play_again = "Y";
        System.out.println("Please Enter your name");
        String username = ScannerUtil.getConsoleScanner().next();

        Player player = new Player(username);
        System.out.println("Welcome to the Guessing game, " + player.getName() + "!");
        // loops through until use doesn't specify correctly they wish to play again
        do {
            Game game = new Game();
            game.startGame();
            System.out.println("round complete, would you like to play again? enter Y for Yes or N for No");
            play_again = ScannerUtil.getConsoleScanner().next();
        }
        while (play_again.equals("Y")); //only checks for Y not the N, so any invalid answers would also end the game
        System.out.println(("Thank you for playing, goodbye"));

    }
}
