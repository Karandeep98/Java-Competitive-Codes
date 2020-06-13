import java.util.Scanner;

public class Code032_Palindrome {
    static int reverse(int n){
        int num=0;
        while(n>0){
            int r=n%10;
            n/=10;
            num = (num*10) + r;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        while(true) {

            if (num==reverse(num)) {
                System.out.println(num);break;
            }
            else
                num += reverse(num);

        }

    }
}
