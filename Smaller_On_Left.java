package cp;
import java.util.*;
public class Smaller_On_Left
{
	public static int[] Smallestonleft0 (int arr[], int n)
    {
		int[] ans=new int[n];
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            int k=ts.lower(arr[i])==null? -1:ts.lower(arr[i]);
//          TreeSet lower() in Java is used to return the greatest element
//          in this set which is strictly less than the given element. 
//          If no such element exists in this TreeSet 
//          collection then this method returns a NULL
            ans[i]=k;
            ts.add(arr[i]);
        }
        return ans;
    }
	public static int[] Smallestonleft1 (int arr[], int n)
    {
    	int arr1[]=new int[n];
    	arr1[0]=-1;
    	for(int i=1;i<n;i++)
    	{
    		int temp =-1;
    		for(int j=0;j<i;j++)
    			if(arr[j]>temp && arr[j]<arr[i])
    				temp=arr[j];
    		arr1[i]=temp;
    	}
    	return arr1;
    }
	public static void main(String[] args)
	{
		int arr[]= {1, 2, 3}; 
		arr=Smallestonleft0(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
