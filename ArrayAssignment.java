import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 1; i < 11; i++) {
            System.out.print("Enter Integer " + i + " = ");
            int number = sc.nextInt();
            a[i - 1] = number;
        }
        System.out.println(Arrays.toString(a));
    }
}
