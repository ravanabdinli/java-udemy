
import java.util.Scanner;

public class SumOfOdd {


     public static void swap(int a, int b) {
       int temp = a;
       a = b;
       b = temp;}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eded 1 i daxil et:");
        int a = scanner.nextInt();
        System.out.println("Eded 2 ni daxil et:");
        int b = scanner.nextInt();
        int sum = 0;

        if (b>a) {
            swap(a, b); 
        }

        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {

                sum+=i;
                
            }
        }
        System.out.println(sum);
   }

    }
    

