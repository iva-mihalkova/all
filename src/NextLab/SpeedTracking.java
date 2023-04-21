package NextLab;

import java.util.Scanner;

public class SpeedTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Speed = Double.parseDouble(scanner.nextLine());
        if (Speed <= 10.0) {
            System.out.println("slow");
        }
        else if (Speed <= 50.0) {
            System.out.println("average");
        }
        else if (Speed <= 150.0) {
            System.out.println("fast");
        }
        else if (Speed <= 1000.0) {
            System.out.println("ultra fast");
        }
        else if (Speed > 1000.1) {
            System.out.println("extremely fast");
        }
    }
}
