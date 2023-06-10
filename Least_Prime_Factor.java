package cp;
import java.util.Arrays;
public class Least_Prime_Factor 
{
	public static int[] leastPrimeFactor(int N)
    {
		int[] leastPrimeFactors = new int[N + 1];
        Arrays.fill(leastPrimeFactors, 1);
        for (int i = 2; i <= N; i++)
        {
            if (leastPrimeFactors[i] == 1) 
            {
                leastPrimeFactors[i] = i; 
                for (int j = i * i; j <= N; j += i)
                    if (leastPrimeFactors[j] == 1)
                        leastPrimeFactors[j] = i;
            }
        }
        return leastPrimeFactors;
    }
	public static void main(String[] args) 
	{
		int ans[]=leastPrimeFactor(4);
		for(int i=1;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	}
}