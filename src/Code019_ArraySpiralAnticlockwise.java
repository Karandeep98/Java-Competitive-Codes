import java.util.Scanner;

public class Code019_ArraySpiralAnticlockwise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       int [][] a=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int left=0,right=m-1,up=0,down=n-1,dir=0;
        while(left<=right&&down>=up){
            if(dir==0){
                for(int i=up;i<=down;i++){
                    System.out.print(a[i][left]+", ");
                }
                dir=1;left++;
            }
            if(dir==1){
                for(int i=left;i<=right;i++){
                    System.out.print(a[down][i]+", ");
                }
                dir=2;down--;
            }
            if(dir==2){
                for(int i=down;i>=up;i--){
                    System.out.print(a[i][right]+", ");
                }
                dir=3;right--;
            }
            if(dir==3){
                for(int i=right;i>=left;i--){
                    System.out.print(a[up][i]+", ");
                }
                dir=0;up++;
            }
        }
        System.out.print("END");
            }
    }

