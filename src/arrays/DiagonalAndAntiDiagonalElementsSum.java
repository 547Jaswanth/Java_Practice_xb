package arrays;

import java.util.Scanner;

public class DiagonalAndAntiDiagonalElementsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}

