package cp;
public class Consecutive_1_s_not_allowed 
{
	public static long countStrings(int n)
	{
		long mod=1000000007,lastNumwithZero=1,lastNumwithOnes=1,currentNumwithZero=0;
        for (int i = 1; i <= n; i++) 
        {
            currentNumwithZero=(lastNumwithZero+lastNumwithOnes)%mod;
            lastNumwithOnes = lastNumwithZero;
            lastNumwithZero = currentNumwithZero;
        }
        return currentNumwithZero;
	}
	public static void main(String[] args) 
	{
		System.out.println(countStrings(3));
	}
}