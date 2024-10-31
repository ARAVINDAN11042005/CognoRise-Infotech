import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        // Array of words to choose from
        String[] words = { "java", "programming", "hangman", "computer", "developer", "networking" };

        // Select a random word
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        int wordLength = wordToGuess.length();

        // Variables for the game
        char[] guessedWord = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            guessedWord[i] = '_'; // Initialize with underscores
        }

        int incorrectGuesses = 0;
        int maxGuesses = 6; // Limit for incorrect guesses
        boolean wordGuessed = false;

        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (incorrectGuesses < maxGuesses && !wordGuessed) {
            System.out.println("Current word: " + new String(guessedWord));
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().charAt(0);

            // Check if the guessed letter is in the word
            boolean correctGuess = false;
            for (int i = 0; i < wordLength; i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            // If the guess is incorrect
            if (!correctGuess) {
                incorrectGuesses++;
                displayHangman(incorrectGuesses);
                System.out.println("Incorrect guess! Remaining tries: " + (maxGuesses - incorrectGuesses));
            }

            // Check if the word is fully guessed
            wordGuessed = new String(guessedWord).equals(wordToGuess);
        }

        // End of the game
        if (wordGuessed) {
            System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game over! The word was: " + wordToGuess);
        }

        scanner.close();
    }

    // Display hangman figure based on the number of incorrect guesses
    public static void displayHangman(int incorrectGuesses) {
        switch (incorrectGuesses) {
            case 1:
                System.out.println(" O");
                break;
            case 2:
                System.out.println(" O\n |");
                break;
            case 3:
                System.out.println(" O\n/|");
                break;
            case 4:
                System.out.println(" O\n/|\\");
                break;
            case 5:
                System.out.println(" O\n/|\\\n/");
                break;
            case 6:
                System.out.println(" O\n/|\\\n/ \\");
                break;
            default:
                System.out.println();
        }
    }
}
