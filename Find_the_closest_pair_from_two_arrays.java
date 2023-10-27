package cp;
import java.util.*;
public class Find_the_closest_pair_from_two_arrays 
{
	public static ArrayList<Integer> printClosest(int arr[],int brr[],int n,int m,int x) 
    {
		int min=Integer.MAX_VALUE,i=0,j=m-1,a=-1,b=-1;
        while(i<n && j>=0)
        {
            int sum = arr[i] + brr[j];
            int diff = Math.abs(x - sum);
            if(diff < min)
            {
                min = diff;
                a = arr[i];
                b = brr[j];
            }
            if(sum > x)
            	j--;
            else if(sum < x)
            	i++;
            else
            	break;
        }
        return new ArrayList<Integer>(Arrays.asList(a,b));
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 4, 5, 7};
		int brr[] = {10, 20, 30, 40};
		int X = 50;
		System.out.println(printClosest(arr,brr,arr.length,brr.length,X));
	}
}