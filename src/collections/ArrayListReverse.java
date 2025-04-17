package collections;

import java.util.ArrayList;

public class ArrayListReverse {
    public static  void reverse(ArrayList<Integer> list){
        int n = list.size();
        int start =0;
        int end = n-1;

        while(start <=end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static  void printArr(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        reverse(list);
        printArr(list);
    }
}
