import java.util.*;
public class Contestque1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //CLinkedListNode node=null;
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int Q=sc.nextInt();
        for(int m=0;m<Q;m++) {
            int x = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int c = 0, sum = 0;
                //int f=0;
                for (int j = i; c <= x || x == 0; j--) {
                    if (x == 0) {
                        sum += arr[j];
                        break;
                    }
                    else{
                       sum+=arr[j];
                       if(j==0){
                           j=N;

                       }
                       c++;
                    }
                  /*  else {
                        if (j <= 0) {
                            j = N;

                        } else {
                            sum+=arr[--j];
                            c++;
                        }
                    }*/
                }
                arr[i] = sum;

            }
        }
       // int as=0;
        for(int i=0;i<N;i++){
            //as+=arr[i];
            System.out.print(arr[i]+" ");
        }
      //  System.out.print(as%(Math.pow(10,9)+7));
    }
}
