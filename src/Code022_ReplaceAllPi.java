import java.util.Scanner;

public class Code022_ReplaceAllPi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            t--;
            String s=sc.next();
            StringBuilder str =new StringBuilder(s);

            for(int i=0;i<str.length()-1;i++){
//                System.out.println(str.substring(i,i+2));
                if(str.substring(i, i + 2).equals(("pi"))){

                    str.replace(i,i+2,"3.14");

                }
            }
            System.out.println(str);
        }
    }
}
