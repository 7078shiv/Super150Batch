import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input of no. of rows
        int row = 1;
        int nst = n / 2;
        int nsp = 1;
        while (row <= n) {
            if (row == 1 || row == n) {
                int cst = 1;
                while (cst <= n) {
                    System.out.print("*\t");
                    cst++;
                }
                row++;
                System.out.println();

            } else {
                // stars
                int cst = 1;
                while (cst <= nst) {
                    System.out.print("*\t");
                    cst++;
                }
                // space
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print("\t");
                    csp++;
                }
                // stars
                cst = 1;
                while (cst <= nst) {
                    System.out.print("*\t");
                    cst++;
                }
                //prep for next step
                if (row <= n / 2) {
                    nst--;
                    nsp += 2;
                } else {
                    nst++;
                    nsp -= 2;
                }
                row++;
                System.out.println();
            }
        }
    }
}
