import java.util.Scanner;

public class Code016_ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder str =new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-48;
            int b=9-a;
            char ch = (char)(b+'0');
            if(i==0 && b==0){}
           else if(b<a) str.setCharAt(i,ch);
        }
        System.out.println(str);
    }
}
