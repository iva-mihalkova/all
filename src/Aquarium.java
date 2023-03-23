import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Length = Integer.parseInt(scanner.nextLine());
        int Width = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        Double Percent = Double.parseDouble(scanner.nextLine());
        int Volume = Length * Width * Height;
        Double ExPercent = Percent / 100.0;
        Double VolumeLitters = Volume * 0.001;
        System.out.println(VolumeLitters * (1 - ExPercent));

    }
}
