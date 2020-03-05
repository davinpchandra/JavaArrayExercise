import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int b[] = new int[5];

        for(int i = 0, j = 0; i < a.length; i++) {
            if(i != a.length - 1) {
                j++;
                b[j] = a[i];
            }
            else {
                j = 0;
                b[j] = a[i];
            }
        }

        System.out.println();
        System.out.print("Input = ");
        System.out.println(Arrays.toString(a));
        System.out.print("Output = ");
        System.out.println(Arrays.toString(b));
    }
}
