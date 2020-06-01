import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            while (spaces>0){
                System.out.print(" ");
                spaces--;
            }
            System.out.print("*");
            int x=n-2;
            while(x>0){
               if(i==1||i==n) System.out.print("*");
               else System.out.print(" ");
                x--;
            }
            System.out.println("*");
        }
    }
}
