import java.util.Scanner;

public class Code002_Quadratic {
    public static void main(String[] args) {
        int a,b,c;
        float d;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d = (b*b)-(4*a*c);
        if(d>=0){
            double x1= (-b +Math.sqrt(d))/(2*a);
            double x2= (-b -Math.sqrt(d))/(2*a);
            if(d==0)
                System.out.println("Real and Equal");
            else
                System.out.println("Real and Distinct");
            if(x1<x2)
            System.out.println((int)x1+" "+(int)x2);
            else
                System.out.println((int)x2+" "+(int)x1);
        }
        else{
            System.out.println("Imaginary");
        }
    }

}
