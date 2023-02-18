package cp;
public class Max_Sum_Without_Adjacents 
{
	public static int findMaxSum(int arr[], int n) 
    {
		if(n==1)
			return arr[0];         
		if(n>2)                     
			arr[n-3]+=arr[n-1];   
        for(int i=n-4;i>=0;i--)
            arr[i]+=Math.max(arr[i+2],arr[i+3]);                                    
        return Math.max(arr[0],arr[1]);  
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 5, 10, 100, 10, 5};
		System.out.println(findMaxSum(arr,arr.length));
	}

}
