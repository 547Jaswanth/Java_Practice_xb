package patterns;

import java.util.Scanner;

public class Patterns {

    public static void square(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void right_Angle_triangle(int n)
    {
        for(int i=n;i>=0;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int n)
    {
       for(int i=0;i<n-i;i++)
       {
           for(int j=n-i;j>1;j--)
           {
              System.out.print(" ");
           }
       }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();

      square(n);
      right_Angle_triangle(n);
      triangle(n);

    }
}
