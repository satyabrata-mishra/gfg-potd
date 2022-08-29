package cp;
import java.util.*;
public class Counting_Elements_In_Two_Array
{
	public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<m;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
				if(arr1[i]>=arr2[j])
					++count;
			ans.add(count);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr1[] = {4,8,7,5,1};
		int arr2[] = {4,48,3,0,1,1,5};
		System.out.println(countEleLessThanOrEqual(arr1,arr2,arr1.length,arr2.length));
	}

}
