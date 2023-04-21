package NextLab;

import java.util.Scanner;

public class GuessFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String FigureType = scanner.nextLine();
       Double area = 0.0;
       if (FigureType.equals("square")) {
           Double side = Double.parseDouble(scanner.nextLine());
           area = side * side;
       } else if (FigureType.equals("rectangle")) {
           Double sideA = Double.parseDouble(scanner.nextLine());
           Double sideB = Double.parseDouble(scanner.nextLine());
           area = sideA * sideB;
       } else if (FigureType.equals("circle")) {
           Double radius = Double.parseDouble(scanner.nextLine());
           area = Math.PI * radius * radius;
       } else if (FigureType.equals("triangle")) {
           Double a = Double.parseDouble(scanner.nextLine());
           Double h = Double.parseDouble(scanner.nextLine());
           area = (a * h) / 2;
       }
        System.out.printf("%.3f",  area);
    }
}
