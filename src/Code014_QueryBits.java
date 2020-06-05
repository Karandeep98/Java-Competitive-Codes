import java.util.ArrayList;
import java.util.Scanner;

public class Code014_QueryBits {
    static int decimal(ArrayList<Integer> a,int l,int r){
        int num=0;
        int pow=0;
        for(int i=r;i>=l;i--){
           if(a.get(i)==1) num+=Math.pow(2,pow);
           pow++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add(0);
        }
        while(q>0){
            q--;
                int type=sc.nextInt();
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(type==0){
                    for(int j=l;j<=r;j++){
                        a.set(j,0);
                    }
                }
                if(type==1){
                    for(int j=l;j<=r;j++){
                        a.set(j,1);
                    }
                }
                if(type==2){
                    System.out.println(decimal(a,l,r));
                }

        }
    }
}
