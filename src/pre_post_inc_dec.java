import java.util.Scanner;

public class pre_post_inc_dec {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        if(m>=75){
            System.out.println("A");
        }
        else if(m<=75 && m>=65){
            System.out.println("B");
        }
        else if(m<=65 && m>=55){
            System.out.println("c");
        }
        else if(m<=55 && m>=40){
            System.out.println("D");
        }
        else {
            System.out.println("fail");
        }
    }
}
