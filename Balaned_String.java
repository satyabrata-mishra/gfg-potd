package cp;
import java.util.*;
public class Balaned_String 
{
	private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
    private static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n != 0) 
        {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
	public static String BalancedString(int N) 
    {
		StringBuilder res = new StringBuilder(N);
        res.append(ALPHABETS.repeat(N / 26));
        int sod = sumOfDigits(N);
        N %= 26;
        if(N == 0) 
            return res.toString();
        int count = ((N >> 1) + (N & 1) * (1 - (sod & 1))); 
        res.append(ALPHABETS, 0, count);
        res.append(ALPHABETS, 26 - N + count, 26);
        System.out.println(res);
        return res.toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(BalancedString(57).compareTo("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcyz"));
	}

}
