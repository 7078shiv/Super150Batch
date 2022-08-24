package Pattern;

import java.util.Scanner;

public class DoubleSlidedPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=2;
        int nsp1=n-1;
        int row=1;
        int nsp2=1;
        int val=1;
        while(row<=n){
           if(row==1 || row==n){
               int j=1;
               while(j<=nsp1){
                   System.out.print("  ");
                   j++;
               }
               System.out.print(val+" ");
               nsp1-=2;
               val++;

           }else{
               int i=1;
               while(i<=nsp1){
                   System.out.print("  ");
                   i++;
               }
               int j=1;
               int temp=val;
               while(j<=star && temp<=val){
                   System.out.print(temp+" ");
                   temp--;
                   j++;
               }
               int s2=1;
               while(s2<=nsp2){
                   System.out.print("  ");
                   s2++;
               }
               //star 3
               int st3=1;
                temp=1;
               while(st3<=star){
                   System.out.print(temp+" ");
                   temp++;
                   st3++;
               }
               if(row<=n/2){
                   star++;
                   nsp1-=2;
                   nsp2+=2;
                   val++;
               }
               else{
                   star--;
                   nsp1+=2;
                   nsp2-=2;
                   val--;
               }

           }
            row++;
            System.out.println();
        }
    }
}
