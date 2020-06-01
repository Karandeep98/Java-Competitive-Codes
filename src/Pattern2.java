import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1) System.out.println(1);
        if(n>=2) System.out.println(11);
        for(int i=3;i<=n;i++){
            System.out.print(i-1);
            int x=i-2;
            while(x>0){
                System.out.print(0);
                x--;
            }
            System.out.println(i-1);
        }
    }
}
