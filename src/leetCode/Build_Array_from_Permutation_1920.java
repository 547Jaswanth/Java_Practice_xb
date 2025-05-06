package leetCode;


import java.util.Arrays;

class Solution9 {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[nums.length];

        for(int i=0;i<n;i++)
        {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}

public class Build_Array_from_Permutation_1920 {
    public static void main(String[] args) {
        int arr[]={0,2,1,5,3,4};
        System.out.println("Acutual Array: "+Arrays.toString(arr));
        Solution9 solution9=new Solution9();

        int res[]=solution9.buildArray(arr);

        System.out.println("Resulted Array: "+Arrays.toString(res));


    }
}
