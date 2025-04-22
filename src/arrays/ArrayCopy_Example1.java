package arrays;

import java.awt.*;
import java.util.Arrays;

public class ArrayCopy_Example1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int arr2[]=new int[5];

        System.out.println(Arrays.toString(arr));

        System.arraycopy(arr,0,arr2,0,5);

        System.out.println(Arrays.toString(arr2));


    }
}
