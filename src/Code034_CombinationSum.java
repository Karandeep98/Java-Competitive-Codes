import java.util.*;
public class Code034_CombinationSum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        while(t>0){
            t--;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                Integer x=sc.nextInt();
                a.add(x);
                if(mp.containsKey(x)){
                    mp.put(x,mp.get(x)+1);
                }
                else mp.put(x,1);
            }
            Integer sum =sc.nextInt();
            Collections.sort(a);
            for(Integer i: a){
//                System.out.println(i);
                if(mp.containsKey(sum-i) && i<=(sum-i))
                    System.out.print("(" + i + " " + (sum - i) + ")");
            }
//            System.out.println();
        }
    }

}
