import java.util.*;

public class Code027_SortGame {
    static Map<Integer,String> mp=new HashMap<>();
    static void sort(){
        ArrayList<Integer> a=new ArrayList<Integer>(mp.keySet());
        Collections.sort(a);
        for (Integer i: a){
            System.out.println(i+mp.get(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        Vector<String> v=new Vector<>();
//        v.add();
//        ArrayList<Pair<String,Integer>> v;
        while (n>0){
            n--;
            String s=sc.next();
            int num=sc.nextInt();
            if(num>x) {
//                v.add(Pair.);
                mp.put(num, s);
                sort();
            }
        }
    }
}
