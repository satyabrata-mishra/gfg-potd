package trial;

import java.util.Scanner;
//Dam of Candies
public class Day6
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int s=sc.nextInt();
		System.out.println("Enter the array: ");
		int a[]=new int[s];
		for (int i=0;i<s;i++)
			a[i]=sc.nextInt();
		int first=0,last=s-1,area=0;
		while (first<last)
		{
			int temp=(last-first-1)*Math.min(a[first], a[last]);
			area=Math.max(area, temp);
			if(a[first]<a[last])
				first++;
			else
				last--;
		}
		System.out.println(area);
	}

}
