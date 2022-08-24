import java.util.Scanner;

public class PascleTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=0;

        while(star<=n){
            int val=1;
            int i=0;
            while(i<star){
                System.out.print(val+" ");
                val=(val*(row-i))/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
