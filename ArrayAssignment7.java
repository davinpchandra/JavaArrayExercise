import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int len = a.length;
        int b[] = new int[len/2];
        int c[] = new int [len - b.length];

        for(int i = 0; i < len; i++) {
            if(i < b.length) {
                b[i] = a[i];
            }
            else {
                c[i - b.length] = a[i];
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
