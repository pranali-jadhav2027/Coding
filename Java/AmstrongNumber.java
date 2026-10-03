/*
Write a java program to Check Number Is Armstrong Number or Not.

Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
Input:

Number = 153

Output:

Armstrong Number

Explanation:

153 has 3 digits.
1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
Since the result equals the original number, it is an Armstrong Number.
*/
import java.util.*;
public class AmstrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();  
		int count=0;
		double sum = 0;
		int num=n;
		
		while (num>0)      
		{ 
			num= num/10;
			count++;
			
		}
		System.out.println("Count="+count);
		num=n;
		while(num>0)
			{
				int rem = num%10; // 3
				double power = Math.pow(rem,count);
				sum=sum+power;
				num=num/10;
			}
		  
		 System.out.println("Sum="+sum);
		 
		if (sum ==n)
		 {
			System.out.println("Amstrong Number ");
		 }
		 else 
		 
		{
			System.out.println(" NOT Amstrong Number ");
		}
		 
		
	}
}