import java.util.Scanner;

public class Calcute_hours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = scanner.nextInt();
        int hours = projects * 3;
        System.out.print("The architect " + name + " will need " + hours + " hours to complete " + projects + " project/s.");

    }}
