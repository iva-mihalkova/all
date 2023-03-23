import java.util.Scanner;

public class Zooshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int forDogs = scanner.nextInt();
        int forCats = scanner.nextInt();
        double PriceforDogs = forDogs * 2.5;
        double PriceforCats = forCats * 4.0;
        System.out.println(PriceforDogs + PriceforCats + " lv.");

    }
}
