import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int maxValue = a[0];
        for(int x = 1; x < a.length; x++) {
            if(a[x] > maxValue) {
                maxValue = a[x];
            }
        }

        int minValue = a[0];
        for(int x = 1; x < a.length; x++) {
            if(a[x] < minValue) {
                minValue = a[x];
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println("Largest element = " + maxValue);
        System.out.println("Smallest elenent = " + minValue);
    }
}
