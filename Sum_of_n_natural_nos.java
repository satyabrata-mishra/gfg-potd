package cp;
public class Sum_of_n_natural_nos 
{
	static int sumOfNaturals(int n) 
    {
        long ans=(long)n*(n+1)/2;
        ans=(long)ans%1000000007;
        return (int)ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(sumOfNaturals(5));
	}
}