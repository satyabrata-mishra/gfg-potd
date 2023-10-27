package cp;
import java.util.*;
public class First_and_last_occurrences_of_x 
{
	public static int binarySearch(int a[],int n,int key,boolean findFirst)
	{
		int low=0,high=n-1,ans=-1;
		while(low<=high)
		{
			int mid = low+(high-low)/2;
			if(a[mid]==key)
			{
				ans=mid;
				if (findFirst) 
                    high = mid - 1;
                else 
                    low = mid + 1;
			}
			else if(a[mid]<key)
				low=mid+1;
			else
				high=mid-1;
		}
		return ans;
	}
	public static ArrayList<Integer> find(int arr[], int n, int x)
    {
        return new ArrayList<Integer>(Arrays.asList(binarySearch(arr,n,x,true),binarySearch(arr,n,x,false)));
    }
	public static void main(String[] args) 
	{
		 int x=7;
		 int arr[] = { 1, 3, 5, 5, 5, 5, 7, 67, 123, 125 };
		 System.out.println(find(arr,arr.length,x));
	}
}