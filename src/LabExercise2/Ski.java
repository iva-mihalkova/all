package LabExercise2;

import java.util.Scanner;

public class Ski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String kindRoom = scanner.nextLine();
        String comment = scanner.nextLine();

        double price = 0.00;
        double finalPrice = 0.00;
        if ("room for one person".equals(kindRoom)) {
            price = (days - 1) * 18.00;
            if (comment.equals("positive")) {
                finalPrice = price + (price * 0.25);
            } else if (comment.equals("negative")) {
                finalPrice = price - (price * 0.10);
            }
        }
        if ("apartment".equals(kindRoom)) {
            price = (days - 1) * 25.00;
            if (days < 10) {
                price = price - (price * 0.30);
            } else if (days >= 10 && days <= 15) {
                price = price - (price * 0.35);
            } else {
                price = price - (price * 0.50);
            } if (comment.equals("positive")) {
                finalPrice = price + (price * 0.25);
            } else if (comment.equals("negative")) {
                    finalPrice = price - (price * 0.10);
            }
        }
        if ("president apartment".equals(kindRoom)) {
            price = (days - 1) * 35.00;
            if (days < 10) {
                price = price - (price * 0.10);
            } else if (days >= 10 && days <= 15) {
                price = price - (price * 0.15);
            } else {
                price = price - (price * 0.20);
            } if (comment.equals("positive")) {
                finalPrice = price + (price * 0.25);
            } else if (comment.equals("negative")) {
                finalPrice = price - (price * 0.10);
            }
        }
        System.out.printf("%.2f", finalPrice);
        }
    }
