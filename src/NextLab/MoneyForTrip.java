package NextLab;

import java.util.Scanner;

public class MoneyForTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double TripPrice= Double.parseDouble(scanner.nextLine());
        int Puzzels = Integer.parseInt(scanner.nextLine());
        int TalkingDolls = Integer.parseInt(scanner.nextLine());
        int TeddyBears = Integer.parseInt(scanner.nextLine());
        int Minions = Integer.parseInt(scanner.nextLine());
        int Tracks = Integer.parseInt(scanner.nextLine());
        int ToysCount = Puzzels + TalkingDolls + TeddyBears + Minions + Tracks;
        double SumToys = (Puzzels * 2.60) + (TalkingDolls * 3.0) + (TeddyBears * 4.10) + (Minions * 8.20) + (Tracks * 2.00);
        double Disscount = 0;
        if (ToysCount >= 50) {
            Disscount = SumToys - (SumToys * 0.25);
        } else if (ToysCount < 50) {
            Disscount = SumToys;
        }
        double Rent = Disscount * 0.10;
        double FinalPrice = Disscount - Rent;

        if (FinalPrice >= TripPrice) {
            System.out.printf( "Yes! %.2f lv left.", FinalPrice - TripPrice);
        }
        else if (FinalPrice < TripPrice) {
            System.out.printf("Not enough money! %.2f lv needed.", TripPrice - FinalPrice);
        }
    }
}
