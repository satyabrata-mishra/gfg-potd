package cp;
public class Number_of_occurrence 
{
	int binarySearch(int arr[], int n, int x,boolean firstOccurance)
    {
        int lo=0,hi=n-1,ans=-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x)
            {
                ans=mid;
                if(firstOccurance)
                	hi=mid-1;
                else
                	lo=mid+1;
            }
            else if(arr[mid]>x)
                hi=mid-1;
            else lo=mid+1;
        }
        return ans;
    }
	int count(int[] arr, int n, int x)
	{
		int last=binarySearch(arr, n, x, false),first=binarySearch(arr, n, x, true);
		if(first==-1)
		    return 0;
        return last-first+1;
	}
	public static void main(String[] args) 
	{
		int  X = 4;
		int Arr[] = {1, 1, 2, 2, 2, 2, 3};
		Number_of_occurrence ob = new Number_of_occurrence();
		System.out.println(ob.count(Arr,Arr.length,X));
	}
}