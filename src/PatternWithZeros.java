import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        while(row<=n){
            int k=1;
            while(k<=n){
                if( row==k || k==1)
                System.out.print(row);
                else if(k<=row){
                    System.out.print(0);
                }
                k++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
