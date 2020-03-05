import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        //Lc to Uc and vice versa
        int mask1 = '\u00DF';
        int mask2 = '\u0020';
        int char1 = 'a';
        int char2 = 'B';
        int uc = char1 & mask1;
        int lc = char2 | mask2;

        System.out.printf("%c %c",uc,lc);

        System.out.println();

        //Ascii to Digit and vice versa
        int mask3 = '\u00CF';
        int mask4 = '\u0030';
        int ascii = 48;
        int decimal = 1;
        int aToD = ascii & mask3;
        int dToA = decimal | mask4;

        System.out.printf("%d %d", aToD, dToA);

        System.out.println();

        // Reverse array
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int b[] = new int[a.length];
        int n = a.length;
        for(int i = 0; i < a.length; i++) {
            b[n - 1] = a[i];
            n--;
        }

        System.out.println(Arrays.toString(b));
    }
}
