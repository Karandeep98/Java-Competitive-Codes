import java.util.*;

public class Code031_Largest3digitNumber {
    static int fact(int n){
        if(n==0||n==1) return 1;
        else return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();

        while (n > 0) {
            n--;
            Integer i=sc.nextInt();
            a.add(i);
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
            else
                mp.put(i,mp.get(i)+1);
        }

        Collections.sort(a);
        Collections.reverse(a);
        for(int i=0;i<3;i++){
            System.out.print(a.get(i));
        }

        Integer combinations = fact(a.size());

        for(Integer i: mp.values()){
            if(i>1){
                combinations/=fact(i);
            }
        }
        System.out.print(","+combinations);
    }
}
