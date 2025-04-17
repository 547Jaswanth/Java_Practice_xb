package searchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key value you want search:");
        int key=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]==key)
                {
                    System.out.println("Element "+key+" is prasent at the index position "+i);
                    break;
                }

        }

    }
}
