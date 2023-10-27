package cp;
public class Sum_of_all_divisors_from_1_to_n 
{
	static long sumOfDivisors(int N)
    {
		long ans=0;
		for(int i=1;i<=N;i++)
			ans+=(long)(N/i*i);
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(sumOfDivisors(4));
		System.out.println(sumOfDivisors(5));
	}
}