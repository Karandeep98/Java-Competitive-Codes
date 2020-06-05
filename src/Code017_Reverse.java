import java.util.Scanner;

public class Code017_Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        StringBuilder str =new StringBuilder(s);
        System.out.println(str.reverse());

    }
}
