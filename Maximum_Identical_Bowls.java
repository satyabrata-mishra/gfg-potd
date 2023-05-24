package cp;
public class Maximum_Identical_Bowls 
{
	public static int getMaximum(int N, int[] arr) 
    {
		long sum = 0;
		for(int i:arr)
			sum+=i;
		while(N!=0)
			if(sum%N--==0)
				break;
		return ++N;
    }
	public static void main(String[] args) 
	{
		int arr[] = {3, 1, 5};
		System.out.println(getMaximum(arr.length,arr));
	}
}