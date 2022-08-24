import java.util.Scanner;

import java.util.*;
public class patern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
       // int space=n-1;
        int star=1;
        while(row<=2*(n)){
           // int i=1;
           // while(i<=space){
            //    System.out.print("  ");
           //     i++;
          //  }
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
           // space--;
            if(row<n)
            star++;
            else{
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
