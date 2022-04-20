import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String gameWord = "Hello";
        String checkWord = "";

        for (int x = 0; x < gameWord.length(); x++) {
            checkWord += "_";
        }
        System.out.println(checkWord);

        while (checkWord != gameWord) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a letter to guess: ");
            CharSequence guessChar = scanner.next();

            for (int i = 0; i < gameWord.length(); i++) {
                if (gameWord.contains(guessChar) == true) {
                    checkWord.substring(i, i+1) = (String)guessChar;
                }
            }
        }
    }
}
