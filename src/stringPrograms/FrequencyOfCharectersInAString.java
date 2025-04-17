package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequencyOfCharectersInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your String: ");
        String str=sc.nextLine();

        Map<Character,Integer> charMap=new LinkedHashMap();

        for(int i=0;i<str.length();i++)
        {
            charMap.put(str.charAt(i), charMap.getOrDefault(str.charAt(i),0)+1);

        }
        System.out.println(charMap);
    }
}
