import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int YearTax = Integer.parseInt(scanner.nextLine());
        Double Shoes = YearTax - (YearTax * 0.40);
        Double Cloths = Shoes - (Shoes * 0.20);
        Double Ball = Cloths * 0.25;
        Double Accessories = Ball * 0.20;
        System.out.println(YearTax + Shoes + Cloths + Ball + Accessories);
    }
}
