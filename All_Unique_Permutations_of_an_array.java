package cp;
import java.util.*;
public class All_Unique_Permutations_of_an_array 
{
	static ArrayList<ArrayList<Integer>> ans;
	public static void permute(ArrayList<Integer> a,int i,int j)
	{
		if(i==j)
		{
			if(!ans.contains(a)) 
				ans.add(new ArrayList<>(a));
		}
		for(int k=i;k<=j;k++)
		{
			Collections.swap(a, k, i);
			permute(a,i+1,j);
			Collections.swap(a, k, i);
		}
	}
	static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n)
    {
		ans=new ArrayList<>();
		Collections.sort(arr);
		permute(arr, 0, n-1);
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {4,5};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:arr)
			list.add(i);
		System.out.println(uniquePerms(list,arr.length));
	}
}