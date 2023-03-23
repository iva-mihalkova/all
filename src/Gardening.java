import java.util.Scanner;

public class Gardening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqM = Double.parseDouble(scanner.nextLine());
        double PricesqM = sqM * 7.61;
        Double Discount = PricesqM * 0.18;
        Double FinalPrice = PricesqM - Discount;
        System.out.println("The final price is: " + FinalPrice + " lv.");
        System.out.println("The discount is: " + Discount + " lv.");

    }
}
