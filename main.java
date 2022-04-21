import java.util.Scanner;
import java.util.Random;

public class Main {

    static void gameMethod(String[] words) {
        String checkWord = "";
        Random r = new Random;
        int index = r.nextInt(words.length);
        gameWord = words[index];
        gameWord = gameWord.toLowerCase();
        int counter = 0;
        boolean checker = false;
        for (int x = 0; x < gameWord.length(); x++) {
            checkWord += "_";
        }
        while (counter<6 && !checkWord.equals(gameWord)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a letter: ");
            char guessChar = scanner.nextLine().charAt(0);

            for (int x = 0; x < gameWord.length(); x++) {
                if (guessChar == gameWord.charAt(x)) {
                    checkWord = checkWord.substring(0, x) + guessChar + checkWord.substring(x + 1);
                    checker = true;
                }
            }
            if (checker) {
                if (!checkWord.equals(gameWord))
                System.out.println(checkWord);
            }
            else {
                counter++;
                System.out.println("The letter you entered was not present in the word. Try again.");
                System.out.println("You have " + (6-counter) + " guesses remaining.");

            }
            checker = false;
        }
        if (counter == 6) {
            System.out.println("You ran out of guesses. The word was " + gameWord);
        }
        else {
            System.out.println("Congratulations, you win.");
            System.out.println("The word was " + gameWord);
        }
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world"};
        gameMethod(words);
    }
}
