package leetCode;

import java.util.Scanner;

class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];

        for (int i = 0; i < n; i++) {
            dp[i] = Math.max(dp[i], i > 0 ? dp[i - 1] : 0);

            int points = questions[i][0];
            int brainpower = questions[i][1];
            int next = i + brainpower + 1;

            if (next < n) {
                dp[next] = Math.max(dp[next], dp[i] + points);
            } else {
                dp[n] = Math.max(dp[n], dp[i] + points);
            }

            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        return dp[n];
    }
}

public class BrainPower_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = sc.nextInt();
        System.out.println("Columns: ");
        int columns = sc.nextInt();

        int arr[][]= new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        Solution s= new Solution();
        Long res=s.mostPoints(arr);

        System.out.println(res);

    }
}
