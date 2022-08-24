import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n+1;
        while(row<=n){
            int i=1;
            //int k=1;
            while(i<=star){
                if(i==n && row==n){

                }
                else{
                System.out.print(i+" ");}
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
           /* int l=1;
            while(l<=space){
                System.out.print("  ");
                l++;
            }*/

            int k=1;
            int p=i-1;
            while(k<=star){
                System.out.print(p+" ");
                p--;
                k++;
            }

            star++;
            space-=2;
            row++;
            System.out.println();
        }
    }
}
