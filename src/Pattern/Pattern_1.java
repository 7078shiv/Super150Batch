package Pattern;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        while (row <= n) {

            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // next line
            row++;
            System.out.println();

        }
}
}
