package trial;
import java.util.Scanner;
public class Sorting_a_2d_array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter the elements of the array:");
		for (int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		int count=0;
		int num[]=new int[n*n];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				num[count]=arr[i][j];
				count=count+1;
			}
		}
//		Bubble Sort Algorithm
		for (int i=0;i<((n*n)-1);i++)
		{
			for (int j=0;j<((n*n)-i-1);j++)
			{
				if (num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.print("Enter the Kth position ");
		int k=sc.nextInt();
		System.out.println(k+"th position of the array is "+num[k-1]);
	}

}
