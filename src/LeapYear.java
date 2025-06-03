
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
      int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İli daxil edin: ");
        year = scanner.nextInt();
        scanner.close();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
    }
}
