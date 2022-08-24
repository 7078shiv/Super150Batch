package Pattern;

import java.util.Scanner;

public class HollowRombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int space=n-1;
        int row=1;
        while(row<=n){
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            if(row==1 || row==n){
                int h=1;
                while(h<=n){
                    System.out.print("*");
                    h++;
                }
            }else{
                int k=1;
                while(k<=star){
                    if(k==1 || k==n){
                        System.out.print("*");
                        k++;
                    }
                    else{
                        System.out.print(" ");
                        k++;
                    }
                }
            }
            space--;
            star++;
            row++;
            System.out.println();
        }
    }
}
