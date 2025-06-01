import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ədədi daxil et:");

        int eded = scanner.nextInt();

        int saat = eded / 3600;

        int deqiqe = (eded % 3600) / 60;

        int saniye = eded % 60;

        System.out.println("Saat:" + saat + " Dəqiqə:" + deqiqe + " Saniyə:" + saniye);

        scanner.close();
        
    }
}
