import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int sum = 0;
        int product = 1;

        for(int x : a) {
            sum += x;
            product *= x;
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println("Sum of elements in array = " + sum);
        System.out.println("Product of elements in array = " + product);
    }
}
