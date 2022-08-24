import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a=0;
            int h=0;
            int j=1;
            while(j<=Integer.MAX_VALUE){
                if(j%2==0){
                    a++;
                }
                else{
                    h++;
                }
                if(a>m){
                    System.out.print("Harshit");
                    break;
                }
                else if(h>n){
                    System.out.print("Aayush");
                    break;
                }
                j++;
            }

        }
    }
}
