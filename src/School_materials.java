import java.util.Scanner;

public class School_materials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaning = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        Double fullOrder = (pensils * 5.8) + (markers * 7.2) + (cleaning * 1.2);
        Double orderDiscount = fullOrder * (discount / 100.0);
        System.out.println(fullOrder - orderDiscount);

    }
}
