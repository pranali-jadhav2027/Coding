/*
Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
Input:
Array = [1, 2, 3, 4, 5, 6]

Output:
Array = [2, 1, 4, 3, 6, 5]

Explanation:
Place an even number first followed by an odd number repeatedly until all elements are arranged alternately.
*/
import java.util.*;
public class AlternateEvenOddElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Size of Array:");
		int size = sc.nextInt();
		System.out.println("Enter Elements of Array:");
		int a[] = new int[size];
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length-1;i++)
		{
			if (a[i]%2==0 && a[i+1]%2 !=0 || a[i]%2!=0 && a[i+1]%2 ==0 )
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1]=temp;
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}