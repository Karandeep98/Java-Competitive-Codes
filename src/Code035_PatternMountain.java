import java.util.*;

class Code035_PatternMountain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if(j<=i)
                System.out.print(j);
                else
                    System.out.print(" ");
            }
            for(int j=n-1;j>0;j--){
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}