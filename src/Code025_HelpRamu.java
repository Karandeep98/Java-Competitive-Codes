import java.util.Scanner;

public class Code025_HelpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            t--;
            int c1=sc.nextInt();int c2=sc.nextInt();int c3=sc.nextInt();int c4=sc.nextInt();
            int n=sc.nextInt();int m=sc.nextInt();
            int [] nArray = new int[n];
            int [] mArray = new int[m];
            int sum=0,sum2=0;
            for(int i=0;i<n;i++){
                nArray[i]=sc.nextInt();
                sum+=Math.min(nArray[i]*c1,c2);
            }
            sum=Math.min(sum,c3);
            for(int i=0;i<m;i++){
                mArray[i]=sc.nextInt();
                sum2+=Math.min(mArray[i]*c1,c2);
            }
            sum2=Math.min(sum2,c3);
            sum =Math.min(sum+sum2,c4);
            System.out.println(sum);


        }
    }
}
