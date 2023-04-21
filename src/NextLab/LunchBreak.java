package NextLab;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Movie = scanner.nextLine();
        int TimeMovie = Integer.parseInt(scanner.nextLine());
        double LunchTime = Double.parseDouble(scanner.nextLine());

        double Eating = LunchTime / 8.00;
        double Break = LunchTime / 4.00;
        double FreeTime = LunchTime - (Break + Eating) ;

    if (TimeMovie <= FreeTime) {
        System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", Movie, Math.ceil(FreeTime - TimeMovie));
    } else {
        System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", Movie, Math.ceil(TimeMovie - FreeTime));
    }
    }
}
