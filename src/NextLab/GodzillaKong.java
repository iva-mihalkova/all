package NextLab;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        int Statists = Integer.parseInt(scanner.nextLine());
        double ClothPrice = Double.parseDouble(scanner.nextLine());
        double Decor = Budget * 0.10;
        double AllClothPrice = Statists * ClothPrice;
        if (Statists <= 150) {
            AllClothPrice = AllClothPrice;
        } else if (Statists > 150) {
            AllClothPrice = AllClothPrice - (AllClothPrice * 0.10);
        }
        double FinalPrice = Decor + AllClothPrice;
        if (Budget >= FinalPrice) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left." , Budget - FinalPrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", FinalPrice - Budget);
        }
    }
}
