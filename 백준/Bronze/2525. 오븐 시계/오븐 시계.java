import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int during = sc.nextInt();

        int afterMinute = minute + during;

        if (afterMinute < 60) {
            System.out.println(hour + " " + afterMinute);
        }
        if (afterMinute >= 60) {
            int afterHour = afterMinute / 60;
            int afterHourMinute = afterMinute % 60;

            // 24 시 이전
            if (hour + afterHour < 24) {
                System.out.println(hour + afterHour + " " + afterHourMinute);
            }
            if (hour + afterHour >= 24) {
                System.out.println((hour + afterHour - 24) + " " + afterHourMinute);
            }
        }
    }
}
