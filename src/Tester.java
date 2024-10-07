import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        long startTime = 0;
        long endTime = 0;

        System.out.println("Welcome to the CypherTester! Please, write a password, sentence, or similar.");
        String input = s.nextLine();
        char[] input_as_char_array = input.toCharArray();
        while (exit == false) {
            System.out.println("Choose one of the following ciphers: ");
            System.out.println("1. Caesar, 2. Vigénere, 9. Exit");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    Caesars caesars = new Caesars(input_as_char_array);
                    startTime = System.nanoTime();
                    System.out.println(caesars.Encrypt());
                    endTime = System.nanoTime();
                    System.out.println("Time to encrypt: " + ((endTime - startTime) / 1_000_000_000.0) + " seconds");
                    startTime = System.nanoTime();
                    System.out.println(caesars.Decrypt());
                    endTime = System.nanoTime();
                    System.out.println("Time to decrypt: " + ((endTime - startTime) / 1_000_000_000.0) + " seconds");
                    break;

                case 2:
                    Vigenere vigenere = new Vigenere(input_as_char_array);
                    startTime = System.nanoTime();
                    System.out.println(vigenere.Encrypt());
                    endTime = System.nanoTime();
                    System.out.println("Time to encrypt: " + ((endTime - startTime) / 1_000_000_000.0) + " seconds");
                    startTime = System.nanoTime();
                    System.out.println(vigenere.Decrypt());
                    endTime = System.nanoTime();
                    System.out.println("Time to decrypt: " + ((endTime - startTime) / 1_000_000_000.0) + " seconds");
                    break;

                case 3:

                    break;

                case 9:
                    exit = true;
                    break;
            }

        }
    }
}
