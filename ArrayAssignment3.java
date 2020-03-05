import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        for(int i = 0; i < 20; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int totalPositive = 0;
        int totalNegative = 0;
        int totalOdd = 0;
        int totalEven = 0;
        int totalZero = 0;

        for(int x : a) {
            if(x > 0) {
                totalPositive++;
            }
            else if(x < 0) {
                totalNegative++;
            }
            else {
                totalZero++;
            }
        }
        for(int x : a) {
            if(x % 2 == 0) {
                totalEven++;
            }
            else {
                totalOdd++;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println("Number of positive numbers = " + totalPositive);
        System.out.println("Number of negative numbers = " + totalNegative);
        System.out.println("Number of odd numbers = " + totalOdd);
        System.out.println("Number of even numbers = " + totalEven);
        System.out.println("Number of zeros = " + totalZero);
    }
}
