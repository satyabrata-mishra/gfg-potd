package cp;
public class Form_a_number_divisible_by_3_using_array_digits 
{
	static int isPossible(int N, int arr[]) 
    {
		long sum=0;
		for(int i:arr)
			sum+=(long)i;
		return sum%3==0?1:0;
    }
	public static void main(String[] args)
	{
		int arr[] = {40, 50, 90};
		System.out.println(isPossible(arr.length,arr));
	}
}