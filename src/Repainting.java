import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int nailon = Integer.parseInt(scanner.nextLine());
            int paint = Integer.parseInt(scanner.nextLine());
            int Prepaint = Integer.parseInt(scanner.nextLine());
            int Hours = Integer.parseInt(scanner.nextLine());
            Double nailonSum = (nailon + 2) * 1.50;
            Double paintSum = (paint * 1.10) * 14.50;
            Double PrepaintSum = Prepaint * 5.00;
            Double priceMaterils = nailonSum + paintSum + PrepaintSum + 0.40;
            double Workers = (priceMaterils * 0.30) * Hours;
            System.out.println(priceMaterils + Workers);

    }
}
