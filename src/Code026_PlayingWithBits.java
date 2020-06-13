import java.util.Scanner;

public class Code026_PlayingWithBits {
    static int count(int n){
        int c=0;
        while(n>0){
            if(n%2==1) c++;
            n/=2;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0) {
            t--;
            int n1=sc.nextInt(); int n2=sc.nextInt();
            int sum=0;
            for(int i=n1;i<=n2;i++){
                sum+=count(i);
            }
            System.out.println(sum);
        }
        }
    }
