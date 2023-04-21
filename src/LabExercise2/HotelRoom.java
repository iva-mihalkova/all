package LabExercise2;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double studio = 0.0;
        double apartment = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studio = 50.00 * days;
            apartment = 65.00 * days;
            if (days > 7 && days <= 14) {
                studio = studio - (studio * 0.05);
            } else if (days > 14) {
                studio = studio - (studio * 0.30);
                apartment = apartment - (apartment * 0.10);
            }
        } else if (month.equals("June") || month.equals("September")) {
            studio = 75.20 * days;
            apartment = 68.70 * days;
            if (days > 14) {
                studio = studio - (studio * 0.20);
                apartment = apartment - (apartment * 0.10);
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio = 76.00 * days;
            apartment = 77.00 * days;
            if (days > 14) {
                apartment = apartment - (apartment * 0.10);
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}