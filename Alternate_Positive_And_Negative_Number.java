package cp;
import java.util.*;
public class Alternate_Positive_And_Negative_Number
{
	public static void rearrange(int arr[], int n) 
    {
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			if(arr[i]<0)
				neg.add(arr[i]);
			else
				pos.add(arr[i]);
		int i=0,j=0,k=0;
		while(i<pos.size() && j<neg.size())
		{
			arr[k++]=pos.get(i++);
			arr[k++]=neg.get(j++);
		}
		while(i<pos.size())
			arr[k++]=pos.get(i++);
		while(j<neg.size())
			arr[k++]=neg.get(j++);
    }
	public static void main(String[] args)
	{
		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		rearrange(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
