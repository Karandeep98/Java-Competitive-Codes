import java.util.Scanner;

public class Code010_PrimeVisits {
   static boolean isprime(int n){
        if(n==0||n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            t--;
            int count=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=a;i<=b;i++){
                if(isprime(i)) count++;
            }
            System.out.println(count);
        }
    }
}
