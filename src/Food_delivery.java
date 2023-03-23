import java.util.Scanner;

public class Food_delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Chicken = Integer.parseInt(scanner.nextLine());
        int Fish = Integer.parseInt(scanner.nextLine());
        int Veggies = Integer.parseInt(scanner.nextLine());
        Double ChickenPrice = Chicken * 10.35;
        Double FishPrice = Fish * 12.40;
        Double VeggiesPrice = Veggies * 8.15;
        Double SumOfMenu = ChickenPrice + FishPrice + VeggiesPrice;
        Double Dessert = SumOfMenu * 0.20;
        System.out.println(SumOfMenu + Dessert + 2.50);

    }
}
