package trial;
import java.util.Scanner;
public class Help_classmate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter the array :");
		for (int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		for (int i=0;i<s;i++)
		{
			int temp=0;
			for (int j=i+1;j<s;j++)
			{
				temp=0;
				if (arr[i]>arr[j])
				{
					temp=arr[j];
					break;
				}
			}
			if (temp==0)
				arr[i]=-1;
			else
				arr[i]=temp;
		}
		for (int i=0;i<s;i++)
			System.out.print(arr[i]+" ");
	}

}
