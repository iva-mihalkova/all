package LabExercise2;

import java.util.Scanner;

public class FlowerGarden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        String Roses = "";
        String Dahlias = "";
        String Tulips = "";
        String Narcissus = "";
        String Gladiolus = "";
        double finalPrice = 0.0;
        if ("Roses".equals(flowers)) {
            double priceRoses = 5.00 * flowersCount;
            if (flowersCount > 80) {
                finalPrice = priceRoses - (priceRoses * 0.10);
            } else {
                finalPrice = priceRoses;
            }
        } else if ("Dahlias".equals(flowers)) {
            double priceDahlias = 3.80 * flowersCount;
            if (flowersCount > 90) {
                finalPrice = priceDahlias - (priceDahlias * 0.15);
            } else {
                finalPrice = priceDahlias;
            }
        } else if ("Tulips".equals(flowers)) {
            double priceTulips = 2.80 * flowersCount;
            if (flowersCount > 80) {
                finalPrice = priceTulips - (priceTulips * 0.15);
            } else {
                finalPrice = priceTulips;
            }
        } else if ("Narcissus".equals(flowers)) {
            double priceNarcissus = 3.00 * flowersCount;
            if (flowersCount < 120) {
                finalPrice = priceNarcissus + (priceNarcissus * 0.15);
            } else {
                finalPrice = priceNarcissus;
            }
        } else if ("Gladiolus".equals(flowers)) {
            double priceGladiolus = 2.50 * flowersCount;
            if (flowersCount < 80) {
                finalPrice = priceGladiolus + (priceGladiolus * 0.20);
            } else {
                finalPrice = priceGladiolus;
            }
        }
        if (finalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, budget - finalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice - budget);
        }
    }
}