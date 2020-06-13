import java.math.*;
import java.util.*;

public class Code033_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            n--;
            int num=sc.nextInt();

            BigInteger a= BigInteger.valueOf(1);
            BigInteger b= BigInteger.valueOf(1);
            BigInteger sum= BigInteger.valueOf(0);

            if(num>=1) System.out.print(a+" ");
            if(num>=2) System.out.print(b+" ");
            for(int i=3;i<=num;i++){
                sum=a.add(b);
                a=b;
                b=sum;
                System.out.print(sum+" ");
            }
            System.out.println();

        }
    }
}
