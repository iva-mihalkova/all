import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int booksSheets = Integer.parseInt(scanner.nextLine());
        int sheetsPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hours = (booksSheets / sheetsPerHour) / days;
        System.out.println(hours);

    }
}
