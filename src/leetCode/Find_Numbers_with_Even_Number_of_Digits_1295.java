package leetCode;

class Solution6
{
    public int findNumbers(int[] nums) {

        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            int numCount=0;
            int num=nums[i];
           while(num>0)
            {
                int digit=num%10;
                numCount++;

                num/=10;
            }

            if(numCount%2==0)
            {
                count++;
            }

        }
        return count;

    }
}

public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896,1,2,22,222,2222,22,222222,2};

        Solution6 solution6=new Solution6();

        int res = solution6.findNumbers(arr);

        System.out.println(res);

    }
}
