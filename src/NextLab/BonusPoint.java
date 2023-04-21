package NextLab;

import java.util.Scanner;

public class BonusPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Points = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (Points <= 100) {
            bonus = 5;
        }
        else if (Points > 1000) {
            bonus = Points * 0.1;
        }
        else {
            bonus = Points * 0.2;
        }
        if (Points % 2 == 0)   {
            bonus = bonus + 1;
        }
        else if (Points % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(Points + bonus);
    }
}
