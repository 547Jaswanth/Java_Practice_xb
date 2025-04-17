package numberPrograms;

import java.util.Scanner;

public class WappingTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1: ");
        int n1=sc.nextInt();
        System.out.println("num2: ");
        int n2=sc.nextInt();

        System.out.println("Before Swapping:: n1: "+n1+" n2: "+n2);
       n1=n1+n2;// 10+20=30
       n2=n1-n2;// 30-20=10
       n1=n1-n2;//
        System.out.println("After Swapping:: n1:"+n1+", n2:"+n2);

    }
}
