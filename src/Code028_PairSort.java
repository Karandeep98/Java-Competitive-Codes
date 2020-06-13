import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Pair {
    String name;
    int marks;

    public Pair(String a, int b) {
        this.name = a;
        this.marks = b;
    }
}
//class sortbyname implements Comparator<Pair>{
//
//    public int compare(Pair p1, Pair p2) {
//        if()
//        return p1.name.compareTo(p2.name);
//    }
//}
class mysort implements Comparator<Pair>{

    public int compare(Pair p1, Pair p2) {
        if(p1.marks==p2.marks) {

            return p1.name.compareTo(p2.name)-(2*(p1.name.compareTo(p2.name)));
        }

        return p1.marks-p2.marks;
    }
}

public class Code028_PairSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pair> ar=new ArrayList<>();
        int x=sc.nextInt();
        int n=sc.nextInt();
        while(n>0){
            n--;
            String s=sc.next();
            Integer i=sc.nextInt();
            if(i>=x)
            ar.add(new Pair(s,i));
        }
        System.out.println("Unsorted");
        for(int i=0;i<ar.size();i++){
            System.out.print(ar.get(i).name+" "+ar.get(i).marks+"\n");
        }
//        Collections.sort(ar,new sortbyname());
//        System.out.println("Sorted by name");
//        for(int i=0;i<ar.size();i++){
//            System.out.print(ar.get(i).name+" "+ar.get(i).marks+"\n");
//        }
        Collections.sort(ar,new mysort());
        Collections.reverse(ar);
        System.out.println("Sorted by marks");

        for(int i=0;i<ar.size();i++){
            System.out.print(ar.get(i).name+" "+ar.get(i).marks+"\n");
        }

    }
}
