package LabExercise2;

import java.util.Scanner;

public class SummerCloths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int degrees = Integer.parseInt(scanner.nextLine());
    String timing = scanner.nextLine();
    String cloths = "";
    String shoes = "";
    if ("Morning".equals(timing)) {
        if (degrees >= 10 && degrees <= 18) {
            cloths = "Sweatshirt";
            shoes = "Sneakers";
        } else if (degrees > 18 && degrees <= 24) {
            cloths = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 25) {
            cloths = "T-Shirt";
            shoes = "Sandals";
        }
    } else if ("Afternoon".equals(timing)) {
        if (degrees >= 10 && degrees <= 18) {
            cloths = "Shirt";
            shoes = "Moccasins";
        } else if (degrees > 18 && degrees <= 24) {
            cloths = "T-Shirt";
            shoes = "Sandals";
        } else if (degrees >= 25) {
            cloths = "Swim Suit";
            shoes = "Barefoot";
        }
        } else if ("Evening".equals(timing)) {
        if (degrees >= 10 && degrees <= 18) {
            cloths = "Shirt";
            shoes = "Moccasins";
        } else if (degrees > 18 && degrees <= 24) {
            cloths = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 25) {
            cloths = "Shirt";
            shoes = "Moccasins";
        }
    }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, cloths, shoes);
    }
    }
