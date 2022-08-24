import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                ar.add(i);
            }

        }
        for(int i=0;i<ar.size()-1;i++){
            System.out.println(str.substring(ar.get(i),ar.get(i+1)));
        }
        int indl=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                indl=i;
                break;
            }
        }
        System.out.println(str.substring(indl));
    }
}

