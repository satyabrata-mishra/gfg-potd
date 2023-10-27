package cp;
import java.util.*;
public class Find_All_Four_Sum_Numbers 
{
	public static void bubbleSort(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
	}
	public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int K) 
    {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		bubbleSort(arr, arr.length);
		int n = arr.length;
		for(int i=0;i<n-3;i++)
		{
			for(int j=i+1;j<n-2;j++)
			{
				int left=j+1,right=n-1;
				while(left<right)
				{
					if(arr[i]+arr[j]+arr[left]+arr[right]==K)
					{
						ArrayList<Integer> temp=new ArrayList<Integer>(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
						if(!ans.contains(temp))
							ans.add(temp);
						left++;
						right--;
					}
					else if(arr[i]+arr[j]+arr[left]+arr[right]<K)
						left++;
					else
						right--;
				}
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int K = 23;
		int A[] = {10,2,3,4,5,7,8};
		System.out.println(fourSum(A, K));
	}
}