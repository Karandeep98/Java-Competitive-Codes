import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code029_StringSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> s=new ArrayList<>();
        while(n>0){
            n--;
            s.add(sc.next());
        }
        Collections.sort(s);
        for(int i=0;i<s.size()-1;i++){

            if(s.get(i).length()<s.get(i+1).length())
            if(s.get(i).equals(s.get(i+1).substring(0,s.get(i).length()))){
//             System.out.println("True"+s.get(i));
             String str=s.get(i);
             String str2=s.get(i+1);
             s.set(i,str2);
             s.set(i+1,str);
         }
        }
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }

    }
}
