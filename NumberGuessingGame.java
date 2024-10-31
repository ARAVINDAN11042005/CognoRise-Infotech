import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        int tryCount = 0;

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("You took " + tryCount + " tries.");
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Nope! The number is higher than your guess.");
            } else {
                System.out.println("Nope! The number is lower than your guess.");
            }
        }

        scanner.close();
    }
}
