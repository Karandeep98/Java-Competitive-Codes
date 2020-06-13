import java.util.Scanner;

public class Code024_ProposalDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            t--;
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            int ways=0;
            if(d%n==0) ways++;
            if(d%m==0) ways++;
            if(d%(n+m)==0) ways++;
           int nmax=d/n;
           int mmax=d/m;
//           while()

        }
    }
}
