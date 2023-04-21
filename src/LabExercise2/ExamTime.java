package LabExercise2;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class ExamTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = (examHour * 60) + examMinute;
        int arriveTimeMinutes = (arriveHour * 60) + arriveMinute;
        int difference = Math.abs(examTimeMinutes - arriveTimeMinutes);

        if (examTimeMinutes < arriveTimeMinutes) {
            System.out.println("Late");
            int hour = difference / 60;
            int minutes = difference % 60;
            if (difference < 60) {
                System.out.printf("%d minutes after the start", minutes);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }
        if (examTimeMinutes >= arriveTimeMinutes && difference <= 30) {
            if (examTimeMinutes == arriveTimeMinutes) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", difference);
            }
        }
       if (examTimeMinutes > arriveTimeMinutes && difference > 30) {
           System.out.println("Early");
           int hour = difference / 60;
           int minutes = difference % 60;
           if (difference < 60) {
               System.out.printf("%d minutes before the start", minutes);
           } else {
               System.out.printf("%d:%02d hours before the start", hour, minutes);
           }
       }
    }
}
