import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();

        StringBuilder str =new StringBuilder(s);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(0)>='a' && str.charAt(0)<='z'){
                int a =str.charAt(i)-32;
                str.setCharAt(i,(char) a);
            }
            if(str.charAt(i)==' ') {
                if(str.charAt(i+1)>='a' && str.charAt(i+1)<='z'){
                    int a =str.charAt(i+1)-32;
                    str.setCharAt(i+1,(char) a);
            }
            }
        }
        System.out.println(str);

    }
}
