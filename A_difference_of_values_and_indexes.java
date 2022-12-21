package cp;
public class A_difference_of_values_and_indexes 
{
	public static int maxDistance (int arr[], int n) 
    {
		int mx1 = Integer.MIN_VALUE ;
        int mn1 = Integer.MAX_VALUE ;
        int mx2 = Integer.MIN_VALUE ;
        int mn2 = Integer.MAX_VALUE ;
        for(int i =0 ;i<n;i++)
        {
        	mx1 = Math.max(mx1 , arr[i]-i) ;
        	mn1 = Math.min(mn1 , arr[i]-i) ;
        	mx2 = Math.max(mx2 , arr[i]+i) ;
        	mn2 = Math.min(mn2 , arr[i]+i) ;
        }
        return Math.max(mx1-mn1, mx2-mn2) ;
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 9, 2, 6};
		System.out.println(maxDistance(arr,arr.length));
	}

}
