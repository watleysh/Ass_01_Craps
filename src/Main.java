import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain;
//initial roll
        do {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int dieSum = die1 + die2;

            System.out.println("You rolled " + die1 + " and " + die2 + " = " + dieSum);

            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {
                System.out.println("Crapped out, you lost,game over!");
            } else if (dieSum == 7 || dieSum == 11) { // Corrected to 11
                System.out.println("Natural, you win, game over!");
            } else {
                int point = dieSum;
                System.out.println("The point is " + point);

                while (true) {
                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    dieSum = die1 + die2;

                    System.out.println("You rolled " + die1 + " and " + die2 + " = " + dieSum);

                    if (dieSum == point) {
                        System.out.println("You made the point, you are the winner!");
                        break;
                    } else if (dieSum == 7) {
                        System.out.println("You lost!");
                        break;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }
//will they play again?
            do {
                System.out.println("Would you like to play again? (Y/N)");
                playAgain = scanner.nextLine();
            } while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
