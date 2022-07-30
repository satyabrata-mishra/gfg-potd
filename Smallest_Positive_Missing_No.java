package cp;
import java.util.*;
public class Smallest_Positive_Missing_No 
{
	public static int missingNumber(int arr[], int n)
    {
		Arrays.sort(arr);
        int count=1;
        for(int i=0;i<n;i++)
            if(arr[i]>=0 && count==arr[i])
                ++count;
        return count;
    }
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		System.out.println(missingNumber(a,a.length));
	}
}
