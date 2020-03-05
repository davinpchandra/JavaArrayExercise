import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 5; i++) {
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

        int b[] = new int[a.length - 1];
        for(int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != maxValue) {
                b[j] = a[i];
                j++;
            }
        }

        int maxValueB = b[0];
        for(int x = 1; x < b.length; x++) {
            if(b[x] > maxValueB) {
                maxValueB = b[x];
            }
        }

        int add = maxValue - maxValueB;
        int c[] = new int[a.length + 1];
        for(int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != maxValue) {
                c[j] = a[i];
            }
            else {
                c[j] = maxValueB;
                j++;
                c[j] = add;
            }
            j++;
        }

        System.out.println();
        System.out.print("Array Input = ");
        System.out.println(Arrays.toString(a));
        System.out.print("Output = ");
        System.out.println(Arrays.toString(c));
    }
}
