import java.util.Scanner;

public class Code009_Simpleinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            int x=sc.nextInt();
            sum +=x;
            if(sum<0) break;
            else System.out.println(x);
        }
    }
}
