package NextLab;

import java.util.Scanner;

public class Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int First =  Integer.parseInt(scanner.nextLine());
        int Second = Integer.parseInt(scanner.nextLine());
        int Third = Integer.parseInt(scanner.nextLine());
        int SumTime = First + Second + Third;
        int minutes = SumTime / 60;
        int seconds = SumTime % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
        }
}
