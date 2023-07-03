package cp;
public class Maximum_Index 
{
	public static int maxIndexDiff(int arr[], int n) 
    {
		int[] min = new int[n];
        int[] max = new int[n];
        min[0] = arr[0];
        max[n-1] = arr[n-1];
        for(int i = 1;i<n;i++)
        {
            min[i] = Math.min(min[i-1],arr[i]);
            max[n-i-1] = Math.max(max[n-i],arr[n-i-1]);
        }
        int j = 0,maxDiff = 0;
        for(int i = 0;i<n;i++)
        {
            if(j==n)
            	break;
            while(j<n && min[i] <= max[j]) 
            	j++;
            maxDiff = Math.max(maxDiff,j-i-1);
        }
        return maxDiff;
	}
	public static void main(String[] args) 
	{
		int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		System.out.println(maxIndexDiff(arr,arr.length));
	}
}