import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ədədi daxil et:");

        float eded = scanner.nextFloat();
        if (eded > 0) {
            System.out.println("Ədəd musbetdir.");
        } else if (eded < 0) {
            System.out.println("Ədəd menfidir.");
        } else {
            System.out.println("Ədəd sifirdir.");
        }

        scanner.close();


    }
}
