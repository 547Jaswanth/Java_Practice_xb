package leetCode;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Solution10 {
    public int romanToInt(String s) {

        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (curr < next) {
                res -= curr; // subtract if smaller before larger (like IV)
            } else {
                res += curr;
            }
        }
        res += map.get(s.charAt(n - 1)); // add the last value always

        return res;
    }
}

public class Roman_to_Integer_13 {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("String: ");
        String str=sc.nextLine();

        Solution10 solution10=new Solution10();

        int res=solution10.romanToInt(str);

        System.out.println(res);


    }
}
