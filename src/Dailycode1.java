import java.util.Scanner;
public class Dailycode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            if (Integer.parseInt(str.charAt(str.length() - 1) + "") % 2 == 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }

        }
    }
}
