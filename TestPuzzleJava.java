import java.util.ArrayList;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test getTenRolls
        int[] randomRolls = generator.getTenRolls();
        for (int num : randomRolls) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test getRandomLetter
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        // Test generatePassword
        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);

        // Test getNewPasswordSet
        int length = 5; // Change this value to generate a different number of passwords
        String[] passwordSet = generator.getNewPasswordSet(length);
        for (String pass : passwordSet) {
            System.out.println("Password: " + pass);
        }

        // Test shuffleArray
        int[] arrayToShuffle = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        generator.shuffleArray(arrayToShuffle);
        for (int num : arrayToShuffle) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
