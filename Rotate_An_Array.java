package cp;

import java.util.Arrays;

public class Rotate_An_Array 
{
	static void rotateArr(int arr[], int d, int n)
    {
		for(int j=0;j<d;j++)
		{
			int temp=arr[0];
			for(int i=0;i<n-1;i++)
				arr[i]=arr[i+1];
			arr[n-1]=temp;
		}
    }
	public static void main(String[] args) 
	{
		int arr[]= {2,4,6,8,10,12,14,16,18,20};
		int d=3;
		rotateArr(arr,d,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
