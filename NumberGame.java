import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAttempts = 0;
        int wins = 0;

        while (true) {
            // Input range
            System.out.print("Enter minimum number: ");
            int min = sc.nextInt();
            System.out.print("Enter maximum number: ");
            int max = sc.nextInt();

            // Generate random number in range
            int random = (int) (Math.random() * (max - min + 1)) + min;
            int attempts = 0;

            // Guess loop
            while (true) {
                System.out.print("Guess a number between " + min + " and " + max + ": ");
                int guess = sc.nextInt();
                attempts++;

                if (guess > random) {
                    System.out.println("Too high!");
                } else if (guess < random) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct guess!");
                    wins++;
                    break;
                }
            }

            totalAttempts += attempts;

            System.out.println("Attempts this round: " + attempts);
            System.out.println("Total wins: " + wins);
            double winRate = (double) wins / totalAttempts * 100;
            System.out.printf("Win rate: %.2f%%\n", winRate);

            // Play again?
            System.out.print("Do you want to play again? (y/n): ");
            String again = sc.next();
            if (!again.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
    }
}
