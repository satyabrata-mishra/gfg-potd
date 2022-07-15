package trial;
import java.util.Scanner;
public class Sum_of_two_elements_nearest_to_zero 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=2;
		int arr[]= {18,-1};
		int a=0,b=0,tempmin=Integer.MIN_VALUE,tempmax=Integer.MAX_VALUE;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n-1;j++)
			{
				if (arr[i]!=arr[j])
				{
					int sum=arr[i]+arr[j];
					if (sum>0)
					{
						tempmax=Math.min(tempmax, sum);
					}
					else if (sum<0)
					{
						tempmin=Math.max(tempmin, sum);
					}
					else if(sum==0)
					{
						System.out.println("0");
					}
				}
			}
		}
		System.out.println("Tempmax="+tempmax);
		System.out.println("Tempmin="+tempmin);
		if (tempmin == Integer.MIN_VALUE)
		{
			System.out.println(tempmax);
		}
		else if(tempmax==Integer.MAX_VALUE)
		{
			System.out.println(tempmin);
		}
		else if (Math.abs(tempmin)>tempmax)
		{
			System.out.println(tempmax);
		}
		else if(Math.abs(tempmin)<tempmax)
		{
			System.out.println(tempmin);
		}
		
		
	}
}
