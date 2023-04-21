package NextLab;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double sumCards = cards * 250;
        double sumProcessors = sumCards * 0.35;
        double sumRam = sumCards * 0.10;
        double All = sumCards + (processors * sumProcessors) + (ram * sumRam);
        double disscount = 0;
        if (cards > processors) {
            disscount = All - (All * 0.15);
        } else  {
            disscount = All;
        }
        if (budget > disscount) {
            System.out.printf("You have %.2f leva left!", budget - disscount);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - disscount));
        }
    }
}
