package NextLab;

import java.util.Scanner;

public class Swimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double RecordSec = Double.parseDouble(scanner.nextLine());
        double DistanceM = Double.parseDouble(scanner.nextLine());
        double Timing = Double.parseDouble(scanner.nextLine());

        double TimeSwim = DistanceM * Timing;
        double Trouble = Math.floor(DistanceM / 15);
        double Result = TimeSwim + (Trouble * 12.5);
        if (RecordSec < Result) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Result - RecordSec);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", Math.abs(Result));
        }
    }
}
