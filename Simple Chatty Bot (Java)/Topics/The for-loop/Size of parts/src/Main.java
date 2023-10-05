import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();  // input number of parts here - i.e., 12 parts
        int readyToShip = 0;
        int toBeFixed = 0;
        int rejects =0;

        for (int i =0; i <n; i++) {
            int detectorPrint = scanner.nextInt();

            if (detectorPrint == 1) {
                readyToShip ++;
            } else if (detectorPrint == -1) {
                rejects++;
            } else if (detectorPrint == 0) {
                toBeFixed++;
            }
        }
        System.out.println(toBeFixed + " " + readyToShip  + " " + rejects);

        scanner.close();
    }
}