import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int i=1;
       // if(n!=0)
      //  System.out.print(f+" ");
        while(i<=n){
          /*  int su=f+s;
            System.out.print(su+" ");
            s=f;
            f=su;*/
            int c=f+s;
            f=s;
            s=c;
           // System.out.print(f+" ");
            i++;
        }
        System.out.println(f);
    }
}
