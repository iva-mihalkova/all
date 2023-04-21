package NextLab;

import java.util.Scanner;

public class Time15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int firstSumHours = hours * 60;
        int sumTime =  firstSumHours + minutes + 15;
        int SumHours = sumTime / 60;
        int SumMinutes = sumTime % 60;
        if (SumHours > 23) {
            SumHours = 0;
        }
        if (SumMinutes < 10) {
            System.out.printf("%d:0%d", SumHours,SumMinutes);
        } else {
            System.out.printf("%d:%d", SumHours,SumMinutes);
        }

    }
}
