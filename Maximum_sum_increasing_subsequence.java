package cp;
public class Maximum_sum_increasing_subsequence 
{
	public static int maxSumIS(int arr[], int n)  
	{  
		int temp[] = new int[n];
	    temp[0]=arr[0];
        int i,j,ans=arr[0];
        for (i=1;i<n;i++)
        {
        	for (j=i-1;j>=0;j--)
        		if(arr[i]>arr[j])
        			temp[i]=Math.max(temp[i],temp[j]);
        	 temp[i]+=arr[i];
             ans=Math.max(temp[i], ans);
        }
        return ans;
	} 
	public static void main(String[] args) 
	{
		int arr[] = {5, 3, 2, 4, 7, 9, 8, 2, 3}; //23
		System.out.println(maxSumIS(arr,arr.length));
	}
}