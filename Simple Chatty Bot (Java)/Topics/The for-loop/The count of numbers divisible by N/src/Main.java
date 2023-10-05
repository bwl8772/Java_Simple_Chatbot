import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        //what is first user input? (10)
        int a = scanner.nextInt();

        // what is second user input? (20)
        int b = scanner.nextInt();

        //what is divisor?  (10)
        int n = scanner.nextInt();

        int divisibleCount = (b / n) - ((a - 1) / n);

        System.out.println(divisibleCount);

        scanner.close();
    }
}