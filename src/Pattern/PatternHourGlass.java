package Pattern;
import java.util.Scanner;
public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        int row=1;
        int space=0;
        int star=2*p+1;

        while(row<=2*p+1){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int m=n;
            while(j<=star){
                System.out.print(m+" ");
                if(j<n+1)
                   m--;
               else{
                    m++;
                }
                j++;
            }

            if(row<p+1){
                star-=2;
                space++;
                n--;
            }
            else{
                star+=2;
                space--;
                n++;
            }
            row++;

            System.out.println();
        }
    }
}
