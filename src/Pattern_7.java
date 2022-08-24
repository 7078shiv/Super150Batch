import java.util.Scanner;

public class Pattern_7 {
    public static void pattern_2(int n){
        int row=1;
        int space=0;
        int star=2*(n-1);
        while(row<n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            star-=2;
            space++;
            row++;
            System.out.println();
        }
    }
    public static void pattern(int n){
        int row=1;
        int space=n-1;
        int star=1;
        while(row<n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            space--;
            star+=2;
            row++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int star=n;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            space+=2;
            row++;
            star--;
            System.out.println();

        }
        pattern(7);
        pattern_2(6);
    }
}
