package leetCode;


import java.util.Arrays;
import java.util.stream.IntStream;

class Solution4 {
    public long countSubarrays(int[] nums, long k) {

        int n=nums.length;
        long count=0;

        for(int size=1;size<=n;size++)
        {
            for(int start=0;start<=n-size;start++)
            {
                int arr[]=new int[size];

                for(int j=0;j<size;j++)
                {
                    arr[j]=nums[start+j];
                }
                int sum= IntStream.of(arr).sum();
                if(sum*arr.length < k)
                {
                    count++;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return count;
    }
    public long countSubarrays2(int[] nums, long k) {
        int n = nums.length;
        long res = 0, total = 0;
        for (int i = 0, j = 0; j < n; j++) {
            total += nums[j];
            while (i <= j && total * (j - i + 1) >= k) {
                total -= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}


public class Count_Subarrays_With_Score_Less_Than_K_2302 {
    public static void main(String[] args) {

        int arr[]={1,1,1};
        Solution4 s=new Solution4();
        long res=s.countSubarrays2(arr,5);

        System.out.println(res);
    }
}
