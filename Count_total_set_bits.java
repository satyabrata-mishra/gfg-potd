package cp;

public class Count_total_set_bits 
{
	public static int countSetBits(int n)
	{
		n = n + 1;   
		int result = 0, i = 0;
		while (Math.pow(2,i) < n)
		{
			int p1 = (int)Math.pow(2,i) ; 
			int p2 = (int)Math.pow(2,(i+1));
			result += (p1 * (n / p2)) ; 
			i++;
			if ((n % p2) > p1) 
				result += (n % p1);
		}
		return result;  
    }
	public static void main(String[] args) 
	{
		System.out.println(countSetBits(4));
	}

}
