import java.util.Scanner;

public class PrateekLovescandy {
   static boolean isprime(int n){
        if(n==0||n==1) return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int count=0;
            for(int i=2;i<=Integer.MAX_VALUE;i++) {
                if (isprime(i)) count++;
                if(count==n) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
