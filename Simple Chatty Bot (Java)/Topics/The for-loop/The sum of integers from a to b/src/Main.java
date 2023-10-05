import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int startIncl = 0;
        int endExcl = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        //System.out.println("What is the first number?");
         startIncl = scanner.nextInt();

        //System.out.println("What is the second number?");
        endExcl =  scanner.nextInt();

        for (int i = startIncl; i <= endExcl; i++) {
            sum += i;
        }
        System.out.println(sum); // it prints the sum of all the numbers
    }
}