import java.util.Scanner;

public class Code018_UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            String s1=sc.next();
            String s2=sc.next();
            StringBuilder s3= new StringBuilder();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)) s3.append('1');
                else s3.append('0');
            }
            System.out.println(s3);
        }
    }
}
