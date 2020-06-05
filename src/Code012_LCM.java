import java.util.Scanner;

public class Code012_LCM {
    static int lcm(int a,int b){
        int max;
        if(a>b) max=a;
        else max=b;
        for(int i=max;i<=a*b;i+=max){
            if(i%a==0 && i%b==0) return i;
        }
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(lcm(n1,n2));
    }
}
