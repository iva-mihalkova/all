package NextLab;

import java.util.Scanner;

public class Excellent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Result = Integer.parseInt(scanner.nextLine());
        if (Result >= 5) {
            System.out.println("Excellent!");
        }
    }
}
