import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        Arrays.sort(a);

        System.out.println();
        System.out.print("Modified Array = ");
        System.out.println(Arrays.toString(a));
    }
}
