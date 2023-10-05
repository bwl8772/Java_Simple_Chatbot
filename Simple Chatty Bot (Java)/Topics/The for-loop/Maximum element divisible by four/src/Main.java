import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter an integer (between 4 and 30,000): ");
        int n = scanner.nextInt();
        int maxDivisibleBy4 = 0;

        for (int i = 0; i < n; i++) {
           // System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number >= 4  && number <= 30000 && number % 4 == 0 && number > maxDivisibleBy4) {
                maxDivisibleBy4 = number;
            }
        }

        if (maxDivisibleBy4 != 0) {
          //  System.out.println("The largest number divisible by 4 among those entered is: " + maxDivisibleBy4);
            System.out.println(maxDivisibleBy4);
        } else {
            System.out.println("No valid number entered that is divisible by 4.");
        }

        scanner.close();
    }
}
