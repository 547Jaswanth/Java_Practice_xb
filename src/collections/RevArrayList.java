package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RevArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        List list=new ArrayList();

        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }
                int k=(int)list.get(0),l= (int) list.get(list.size()-1);

        System.out.println("ArrayList: "+list);

        for(int i=0; i<list.size()-1; i++) {

                int start= (int) list.get(k);
                int end=(int)list.get(l);
                int temp=start;
                start=end;
                end=temp;

                k++;
                l--;
        }

        System.out.println(list);
    }


}
