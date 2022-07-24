package cp;
import java.util.*;
public class Leader_In_An_Array 
{
	public static ArrayList<Integer> leaders(int arr[], int n)
    {
       int max=arr[n-1];
       ArrayList<Integer> ans=new ArrayList<>();
       ans.add(arr[n-1]);
       for(int i=n-2;i>=0;i--)
       {
           if(arr[i]>=max)
           {
               max=arr[i];
               ans.add(max);
           }
       }
       Collections.reverse(ans);
       return ans;
    }
	public static void main(String[] args)
	{
		int A[] = {16,17,4,3,5,2};
		System.out.println(leaders(A,A.length));
	}

}
