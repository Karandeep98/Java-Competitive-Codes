import java.util.Scanner;

public class Code020_PlateDropping {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            t--;
            int k=sc.nextInt();
            int n=sc.nextInt();
            if(n%2==0)
            System.out.println((n/2));
            else
                System.out.println((n+1)/2);
        }
    }
}
