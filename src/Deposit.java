import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double DepMoney = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double divident = Double.parseDouble(scanner.nextLine()) / 100;
        double FinalSum = DepMoney + months * ((DepMoney * divident) / 12);
        System.out.println(FinalSum);

    }
}
