import java.util.Scanner;

public class Code001_VonNeuman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            String s=sc.next();
            int num=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    num += Math.pow(2,s.length()-1-i);
//                    System.out.println("character is "+s.charAt(i)+"num= "+num);

                }
            }
            System.out.println(num);
        }
    }
}
