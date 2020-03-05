import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter Integer " + (i+1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to check = ");
        int num = scan.nextInt();

        boolean test = false;

        for(int x : a) {
            if(x == num) {
                test = true;
                break;
            }

        }
        if(test) {
            System.out.println("Number is in array.");
        }
        else {
            System.out.println("Number is not in array.");
        }

    }
}
