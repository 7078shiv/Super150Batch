import java.util.Scanner;

public class PatternNoRombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        n=1;
        int row=1;
        int star=1;
        int space=p-1;
        while(row<=2*p-1){

            int j=1;
            int m=n;
            while(j<=star){
                System.out.print(m+"\t");
                j++;
                if(row<p){
                    star+=2;
                    space--;
                    n++;
                }
                else{
                    star-=2;
                    space++;
                    n--;
                }
            }
            int i=1;
            while(i<=space){
                System.out.print("\t ");
                i++;
            }

            row++;

            System.out.println();
        }
    }
}
