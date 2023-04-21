package LabExercise2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String summer = "";
        String winter = "";
        String Bulgaria = "";
        String Balkans = "";
        String Europe = "";
        String camp = "";
        String hotel = "";

        double price = 0;
        String place = "";
        String  accomodation = "";
        if ("summer".equals(season) && budget <= 100 ) {
            price = budget * 0.30;
            place = "Bulgaria";
        } else if ("summer".equals(season) && budget > 100 && budget <= 1000) {
            price = budget * 0.40;
            place = "Balkans";
        } else if ("winter".equals(season) && budget <= 100) {
            price = budget * 0.70;
            place = "Bulgaria";
        } else if ("winter".equals(season) && budget > 100 && budget <= 1000) {
            price = budget * 0.80;
            place = "Balkans";
        } else if (budget > 1000) {
            price = budget * 0.90;
            place = "Europe";
        }
        if (budget <= 1000 && "summer".equals(season)) {
            accomodation = "Camp";
        } else {
            accomodation = "Hotel";
        }
        if (("Bulgaria".equals(place) || "Balkans".equals(place) || "Europe".equals(place)) && (accomodation.equals("Camp") || (accomodation.equals("Hotel")))) {
            System.out.printf("Somewhere in %s%n", place);
            System.out.printf("%s - %.2f", accomodation, price);
        }
    }
    }
