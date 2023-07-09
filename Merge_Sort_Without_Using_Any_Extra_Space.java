package cp;
import java.util.*;
public class Merge_Sort_Without_Using_Any_Extra_Space 
{
	public static void merge(long arr1[], long arr2[], int n, int m) 
    {
		int i=0,j=0,k=n-1;
		while(i<=k && j<m)
		{
			if(arr1[i]>arr2[j])
			{
				long temp=arr2[j];
				arr2[j]=arr1[k];
				arr1[k]=temp;
				j++;k--;
			}
			else
				i++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
    }
	public static void main(String[] args) 
	{
		long arr1[] = {1, 3, 5, 7}; 
		long arr2[] = {0, 2, 6, 8, 9};
		merge(arr1,arr2,arr1.length,arr2.length);
		for(long i:arr1)
			System.out.print(i+" ");
		for(long i:arr2)
			System.out.print(i+" ");
	}
}