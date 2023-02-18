package cp;
import java.util.*;
public class Good_Stones 
{
	public static int helper(int arr[],int n,int visited[],int index)
	{
		if(index>=n || index<0)
			return 1;
		if(visited[index]!=-1)
			return visited[index];
		visited[index]=0;
		visited[index]=helper(arr,n,visited,index+arr[index]);
		return visited[index];
	}
	public static int goodStones(int n, int[] arr) 
    {
		int visited[]=new int[n];
		Arrays.fill(visited, -1);
		for(int i=0;i<n;i++)
			if(visited[i]==-1)
				visited[i]=helper(arr, n, visited, i);
		int count = 0;
		for(int i=0;i<n;i++)
			if(visited[i]==1)
				++count;
		return count;
    }
	public static void main(String[] args)
	{
		int arr[]= {2, 3, -1, 2, -2, 4, 1};
		System.out.println(goodStones(arr.length,arr));
	}

}
