import java.util.Scanner;

public class Code003_Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1) System.out.println(1);
        if(n>=2) System.out.println(11);
        for(int i=3;i<=n;i++){
            System.out.print(1);
            int x=i-2;
            if(i%2==0){
                while(x>0){
                    System.out.print(0);
                    x--;
                }
            }
            else{
                while(x>0){
                    System.out.print(1);
                    x--;
                }
            }
            System.out.println(1);
        }
    }
}
