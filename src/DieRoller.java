import java.util.Scanner;
import java.util.random.RandomGenerator;

public class DieRoller {
    public static void main(String[] args) {

        RandomGenerator generator = RandomGenerator.getDefault();
        Scanner console = new Scanner(System.in);
        boolean done = false;


        while (!done) {
            boolean done1 = false;
            System.out.printf("%-4s %-4s %-4s %-4s %-3s %n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.printf("--------------------------------%n");
            for (int i = 0; i < 3; i++) {

                int random1 = generator.nextInt(6) + 1;
                int random2 = generator.nextInt(6) + 1;
                int random3 = generator.nextInt(6) + 1;
                int sum = random1 + random2 + random3;


                System.out.printf(" %01d    %01d    %01d    %01d    %02d    %n", i + 1, random1, random2, random3, sum);
            }
            while (!done1) {
                System.out.println("Would you like to play again? [Y/N]: ");
                String response = console.next();
                if (response.equalsIgnoreCase("N")) {
                    done = true;
                    done1 = true;
                } else if (response.equalsIgnoreCase("Y")) {
                    done1 = true;
                } else {
                    System.out.println("Please enter a proper input");
                }
            }

        }
    }
}