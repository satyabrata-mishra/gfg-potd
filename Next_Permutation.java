package cp;
import java.util.*;
public class Next_Permutation 
{
	public static void reverse(int a[],int i,int j)
	{
		while(i<j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
	public static List<Integer> nextPermutation(int arr[])
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int a=0,b=0;
		for(a=arr.length-2;a>=0;a--)
			if(arr[a]<arr[a+1])
				break;
		if(a<0)
		{
			reverse(arr,0,arr.length-1);
			for(int i:arr)
				ans.add(i);
			return ans;
		}
		for(b=arr.length-1;b>=0;b--)
			if(arr[b]>arr[a])
				break;
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		reverse(arr,a+1,arr.length-1);
		for(int i:arr)
			ans.add(i);
		return ans;
	}
	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 6, 5, 4};
		System.out.println(nextPermutation(a));
	}

}
