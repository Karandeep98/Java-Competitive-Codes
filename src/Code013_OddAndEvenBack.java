import java.util.Scanner;

public class Code013_OddAndEvenBack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            String n = sc.next();
            int sumeven = 0, sumodd = 0;
            for (int i = 0; i < n.length(); i++) {
                int x = n.charAt(i) - 48;
                if (x % 2 == 0) sumeven += x;
                else sumodd += x;
            }
            if (sumeven % 4 == 0 || sumodd % 3 == 0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
