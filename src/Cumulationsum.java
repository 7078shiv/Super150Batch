import java.util.ArrayList;
import java.util.Scanner;

public class Cumulationsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cs=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(cs>=0){
            int a=sc.nextInt();
            al.add(a);
            cs+=a;

        }
        for(int i=0;i<=al.size()-2;i++){
            System.out.println(al.get(i));
        }
    }
}
