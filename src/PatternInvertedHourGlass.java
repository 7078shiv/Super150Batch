import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n;
        int row=1;

        while(row<=2*n+1){
            int i=1;
            int no=n;
            while(i<=star){
                System.out.print(no);
                if(i<=n){
                    no--;
                }
                else{
                no++;
                }
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int l=1;

            while(l<=space){
                System.out.print(" ");
                l++;
            }
            int k=1;
            int m=n;
            while(k<=star){
                System.out.print(m);
                m--;
                k++;
            }
           if(row<=n){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
