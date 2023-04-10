package cp;
import java.util.*;
public class Count_Special_Numbers 
{
	public static int countSpecialNumbers(int N, int arr[]) 
    {
		int count = 0;
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			if(i<N-1 && arr[i]==arr[i+1])
				++count;
			else
			{
				for(int j=0;j<i;j++)
				{
					if(arr[i]%arr[j]==0)
					{
						++count;
						break;
					}
				}
			}
		}
		return count;
    }
	public static void main(String[] args) 
	{	
		int arr[] = {2,3,6};
		System.out.println(countSpecialNumbers(arr.length,arr));
		int arr1[]= {5,5,5,5};
		System.out.println(countSpecialNumbers(arr1.length,arr1));
	}

}
