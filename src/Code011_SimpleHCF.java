import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code011_SimpleHCF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        while(n>0){
            int x=sc.nextInt();
            a.add(x);
            n--;
        }
        int min=Collections.min(a);
        int hcf=1;
        for(int i=2;i<=min;i++){
            boolean status=true;
            for(int j=0;j<a.size();j++){
                if(a.get(j)%i!=0) {
                    status=false;
                    break;
                }
            }
            if (status) hcf=i;
        }
        System.out.println(hcf);
    }
}
