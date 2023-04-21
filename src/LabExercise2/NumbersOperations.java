package LabExercise2;

import java.util.Scanner;

public class NumbersOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        String evenOdd = "";
        boolean Zero = false;

        if (operator.equals("+")) {
            result = n1 + n2;
        } else if (operator.equals("-")) {
            result = n1 - n2;
        }
        else if (operator.equals("*")) {
            result = n1 * n2;
        }
        else if (operator.equals("/")) {
            if (n2 == 0) {
                    Zero = true;
        } else {
                result = (n1 * 1.0) / n2 ;
            }
            }
        else if (operator.equals("%")) {
            if (n2 == 0) {
                Zero = true;
            } else {
                result = n1 % n2;
            }
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
        }
        switch (operator) {
            case "+":
            case "-":
            case "*":
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOdd);
                break;
            case "/":
                if (Zero) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }
                break;
            case "%" :
                if (Zero) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
                }
                break;
        }
    }
}
