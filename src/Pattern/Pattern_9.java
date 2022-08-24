package Pattern;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n-1;
        int space=1;
        int row=1;
        while(row<=2*n-1){
            if(row==1 || row==2*n-1){
                int i=1;
                while(i<=2*n-1){
                    System.out.print("*");
                    i++;
                }
                row++;
                System.out.println();
                continue;
            }
            else{
                int j=1;
                while(j<=star){
                    System.out.print("*");
                    j++;
                }
                int s=1;
                while(s<=space){
                    System.out.print(" ");
                    s++;
                }
                int p=1;
                while(p<=star){
                    System.out.print("*");
                    p++;
                }
                if(row<n){
                    star--;
                    space+=2;
                }
                else{
                    star++;
                    space-=2;
                }
                row++;
                System.out.println();
            }
        }
    }
}
