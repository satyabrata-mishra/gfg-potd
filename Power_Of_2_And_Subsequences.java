package cp;
import java.util.*;
public class Power_Of_2_And_Subsequences 
{
	private static int POWER = 2;
    private static long MOD = 1000000007l;
	public static Long numberOfSubsequences(int N, ArrayList<Long> A)
    {
		long count = 0;
        for(int i = 0 ; i < A.size(); i++)
        {
            long num = A.get(i);
            if((num & (num -1)) == 0)
                    count++;
        }
        long res = 1;
        for(int i = 1 ; i <= count ; i++)
                res = (res * POWER) % MOD;
        return res - 1;
    }
	public static void main(String[] args) 
	{
		ArrayList<Long> a = new ArrayList<Long>();
		a.add((long)1);
		a.add((long)2);
		a.add((long)3);
		System.out.println(numberOfSubsequences(a.size(),a));
	}

}
