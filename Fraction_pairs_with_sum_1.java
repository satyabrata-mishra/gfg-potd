package cp;
import java.util.*;
public class Fraction_pairs_with_sum_1 
{
	public static int countFractions(int n, int[] numerator, int[] denominator) 
    {
		 Map<Double,Integer> mp = new HashMap<>();
		 int count=0;
		 for(int i=0; i<n; i++) 
		 {
			 double fract = (double)numerator[i]/denominator[i];
			 double x = (double)(denominator[i]-numerator[i])/denominator[i];
			 count += mp.getOrDefault(x, 0);
			 mp.put(fract, mp.getOrDefault(fract, 0) + 1);
		 }
		 return count;
    }
	public static void main(String[] args) 
	{
		int numerator[] = {3, 1, 12, 81, 2};
		int denominator[] = {9, 10, 18, 90, 5};
		System.out.println(countFractions(numerator.length,numerator,denominator));
	}
}