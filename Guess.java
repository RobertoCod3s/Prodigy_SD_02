import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static int bestScore = (int) Double.POSITIVE_INFINITY; //The least number of guesses
    public static Random rand = new Random();
    public static final Scanner input = new Scanner(System.in);
    public static int numGamesPlayed = 0;
    public static void main(String[] args) {
        String choice = "y";
        System.out.println("Guess a random number between 0 and upperbound");
        System.out.print("Upperbound: ");
        int upper = input.nextInt();
        input.nextLine();
        while(!choice.equalsIgnoreCase("n")) {
            playGame(upper);

            System.out.println("Would you like to play another game?(y/n)");
            choice = input.nextLine();
        }
        System.out.println("Thank you for playing");
    }
    public static void playGame(int upper){
        numGamesPlayed++;

        int randNum = rand.nextInt(upper + 1);

        int yourGuess;

        int countGuess = 0;

        while(true) {
            System.out.println("Guess a random number between 0 and " + upper);
            yourGuess = input.nextInt();
            input.nextLine();
            countGuess++;
            if (yourGuess == randNum) {
                String result = "Your guess is correct.\nRandom Number: " + randNum + "\nNumber of Guesses: " + countGuess + "\nNumber of Games Played: " + numGamesPlayed;
                if(countGuess < bestScore) {
                    bestScore = countGuess;
                    System.out.println("New High Score: " + bestScore);
                }

                System.out.println(result);
                break;
            } else if (yourGuess > randNum) {
                System.out.println("Your Guess is Too High");
            } else {
                System.out.println("Your Guess is Too Low");
            }
        }
    }
}
