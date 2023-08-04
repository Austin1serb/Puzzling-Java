import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // Method to generate an array with 10 random numbers between 1 and 20 inclusive
    public int[] getTenRolls() {
        int[] randomNumbers = new int[10];
        Random randMachine = new Random();

        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = randMachine.nextInt(20) + 1;
        }

        return randomNumbers;
    }

    // Method to get a random letter from the alphabet
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random randMachine = new Random();
        int randomIndex = randMachine.nextInt(26);
        return alphabet[randomIndex];
    }

    // Method to generate a random string of eight characters
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    // Method to generate an array of random eight-character words
    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    // Method to shuffle an array
    public void shuffleArray(int[] arr) {
        Random randMachine = new Random();
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int j = randMachine.nextInt(i + 1);

            // Swap arr[i] with the randomly selected element
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
