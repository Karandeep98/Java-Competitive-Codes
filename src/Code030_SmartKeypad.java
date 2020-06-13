import java.util.Scanner;

public class Code030_SmartKeypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
//        String s=sc.next();
//        for(int i=0;i<s.length();i++){
//            for(int j=0;j<table[s.charAt(i)-48].length();j++){
//                System.out.print(table[s.charAt(i)-48].charAt(j));
//            }
//            System.out.println();

        StringBuffer s=new StringBuffer("abc");
        StringBuffer s2=s;
        s.append("d");
        System.out.println(s +" "+ s2 +" " +(s==s2));
    }
    }

