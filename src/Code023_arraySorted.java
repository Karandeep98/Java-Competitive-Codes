import java.util.Scanner;

public class Code023_arraySorted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        boolean status=true;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
           if(a[i]<a[i-1]) {
              status=false;break;
           }
        }
        if(status) System.out.println("true");
        else System.out.println("false");
    }
}
