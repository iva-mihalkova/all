package LabExercise2;

import java.util.Scanner;

public class BoatForFishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        String Spring = "";
        String Summer = "";
        String Autumn = "";
        String Winter = "";

        double price = 0.00;
        if ("Spring".equals(season)) {
            price = 3000.00;
            if (fishers <= 6) {
                price = 3000.00 - (3000.00 * 0.10);
            } else if (fishers <= 11) {
                price = 3000.00 - (3000.00 * 0.15);
            } else {
                price = 3000.00 - (3000.00 * 0.25);
            }
        } else if ("Summer".equals(season)) {
            price = 4200.00;
            if (fishers <= 6) {
                price = 4200.00 - (4200.00 * 0.10);
            } else if (fishers <= 11) {
                price = 4200.00 - (4200.00 * 0.15);
            } else {
                price = 4200.00 - (4200.00 * 0.25);
            }
        } else if ("Autumn".equals(season)) {
            price = 4200.00;
            if (fishers <= 6) {
                price = 4200.00 - (4200.00 * 0.10);
            } else if (fishers <= 11) {
                price = 4200.00 - (4200.00 * 0.15);
            } else {
                price = 4200.00 - (4200.00 * 0.25);
            }
        } else if ("Winter".equals(season)) {
            price = 2600.00;
            if (fishers <= 6) {
                price = 2600.00 - (2600.00 * 0.10);
            } else if (fishers <= 11) {
                price = 2600.00 - (2600.00 * 0.15);
            } else {
                price = 2600.00 - (2600.00 * 0.25);
            }
        }
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            price = price - (price * 0.05);
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}