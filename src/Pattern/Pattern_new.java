package Pattern;

import java.util.Scanner;

public class Pattern_new {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int no=1;
        int row=1;
        while(row<=2*n-1){
            int i=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            int num=row;
            int col=2*row-1;
            while(j<=col){
                System.out.print(num+"\t");
                if(j<=col/2){
                    num++;
                }
                else{
                    num--;
                }
                j++;
            }
            if(row<=n){
            space--;
            row++;}
            else{
                space++;
                row--;
            }
            System.out.println();
        }
    }
}
