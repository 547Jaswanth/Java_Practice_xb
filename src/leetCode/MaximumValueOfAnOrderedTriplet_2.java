package leetCode;


class Solution2
{
    public long maximumTripletValue(int[] nums) {

        long max=0;

        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    long value=(long)(nums[i] - nums[j])*nums[k];

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
public class MaximumValueOfAnOrderedTriplet_2 {
    public static void main(String[] args) {

        int arr[]={12,6,1,2,7};
        Solution2 solution2=new Solution2();

        long res=solution2.maximumTripletValue(arr);

        System.out.println(res);


    }
}
