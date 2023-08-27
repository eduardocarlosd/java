import java.util.Scanner;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101); // Generates a random number between 0 (inclusive) and 100 (exclusive)

        System.out.println("Random Number: " + randomNumber);

        inputScanner.close(); // Don't forget to close the scanner when you're done using it
    }
}

