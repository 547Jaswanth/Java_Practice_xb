package leetCode;

import java.util.Arrays;
import java.util.Scanner;

class Solution1
{
    public long maximumTripletValue(int[] nums)
    {
        long max=0;
        int n=nums.length;

        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    long value= (long)(nums[i]-nums[j])*nums[k];

                    if(value>max)
                    {
                        max=value;
                    }
                }
            }
        }
        return max;

    }
}

public class MaximumValueOfAnOrderedTriplet_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));

        Solution1 solution1= new Solution1();
        long res=solution1.maximumTripletValue(arr);

        System.out.println(res);
    }
}
