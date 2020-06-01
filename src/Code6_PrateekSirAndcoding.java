import java.util.Scanner;
import java.util.Stack;

public class Code6_PrateekSirAndcoding {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int q=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        while (q>0){
            q--;
            int type=sc.nextInt();
            if(type==2) {
                int cost=sc.nextInt();
                stack.push(cost);
            }
            else if(type==1){
                if(stack.empty()) System.out.println("No Code");
                else System.out.println(stack.pop());
            }
        }
    }
}
