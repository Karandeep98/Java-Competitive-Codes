import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr= new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            int spaces=n-i;
            while(spaces>0){
                System.out.print("  ");
                spaces--;
            }
            arr[i][0]=1;
            arr[i][i-1]=1;
           if(i>1) System.out.print(1+"   ");
            int x=i-2;
            int index=1;
            while(x>0){
                arr[i][index]=arr[i-1][index-1]+arr[i-1][index];
                System.out.print(arr[i][index]+"   ");
                index++;
                x--;
            }
             System.out.println(1);
        }
    }
}
