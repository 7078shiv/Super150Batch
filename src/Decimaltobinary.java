import java.util.Scanner;

public class Decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        System.out.println("enter source base");
        int s=sc.nextInt();
        System.out.println("enter the destination base");
        int d=sc.nextInt();
        //int n=342;
        int sum=0;
        int mul=1;
        while(n>0){
            int rem=n%d;
            sum=sum+rem*mul;
            mul=mul*s;
            n=n/10;
        }
        System.out.println(sum);
    }
}
