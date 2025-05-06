package leetCode;

import java.util.Arrays;

class Solution3
{
    public int subsetXORSum(int[] nums) {
        return sum(nums,0,0);
    }
    public int sum(int arr[],int index,int currXor)
    {
       if(index==arr.length)
       {
           return currXor;
       }
       int withCurr=sum(arr,index+1,currXor ^ arr[index]);

       int withoutCurr=sum(arr,index+1,currXor);

       return withCurr+withoutCurr;
    }

}
public class Sum_of_All_Subset_XOR_Totals {
    public static void main(String[] args) {

        int arr[]={5,1,6};

        Solution3 solution3=new Solution3();
        int res=solution3.subsetXORSum(arr);

        System.out.println(res);
    }
}
