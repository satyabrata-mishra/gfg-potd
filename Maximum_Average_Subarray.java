package cp;
import java.util.*;
public class Maximum_Average_Subarray 
{
	public static int avg(ArrayList<Integer> a)
	{
		int avg=0;
		for(int i:a)
			avg+=i;
		avg=avg/a.size();
		return avg;
	}
	public static void findMaxAverage(int[] arr, int n, int k)
    {
        // code here
		int ans[]=new int[k];
		int temp=Integer.MIN_VALUE;
        for(int x=0;x<n;x++)
        	for(int y=x;y<n;y++)
        	{
        		ArrayList<Integer> a=new ArrayList<Integer>();
        		for(int z=x;z<=y;z++)
        			a.add(arr[z]);
        		int avg=avg(a);
        		if(a.size()==k && avg>temp)
        		{
        			temp=avg;
        			for(int i=0;i<a.size();i++)
        				ans[i]=a.get(i);
        		}
        	}
        for(int i:ans)
        	System.out.print(i+" ");

    }
	public static void main(String[] args)
	{
		int a[]= {3, -435, 335, 10, -50, 100, 20};
		int k=3;
		findMaxAverage(a,a.length,k);
	}

}
