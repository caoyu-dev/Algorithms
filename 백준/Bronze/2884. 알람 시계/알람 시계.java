import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int afterMinute = minute - 45;

        if (afterMinute >= 0) {
            System.out.println(hour + " " + afterMinute);
        } 
        if (afterMinute < 0 && hour > 0) {
            System.out.println((hour - 1) + " " + (60 + afterMinute));
        } 
        if (afterMinute < 0 && hour == 0) {
            System.out.println(23 + " " + (60 + afterMinute));
        }
    }
}
