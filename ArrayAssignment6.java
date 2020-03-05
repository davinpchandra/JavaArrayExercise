import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int len = a.length;
        boolean test = true;
        for(int i = 0; i <= len / 2; i++) {
            if (a[i] != a[len - i - 1]) {
                test = false;
                break;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        if(test == false) {
            System.out.println("Not Palindrome");
        }
        else {
            System.out.println("Palindrome");
        }
    }
}
