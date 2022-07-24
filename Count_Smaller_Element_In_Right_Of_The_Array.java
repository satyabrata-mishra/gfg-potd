package cp;

public class Count_Smaller_Element_In_Right_Of_The_Array 
{
	public static int[] constructLowerArray(int[] arr, int n) 
    {
        for(int i=0;i<n;i++)
        {
        	int count=0;
        	for(int j=i+1;j<n;j++)
        		if(arr[i]>arr[j])
        			++count;
        	arr[i]=count;
        }
        arr[n-1]=0;
        return arr;
    }
	public static void main(String[] args)
	{
		int arr[] = {16,17,4,3,5,2};
		arr=constructLowerArray(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
