package cp;

public class Smallest_number_with_sum_of_digits_as_N_and_divisible_by_10_N 
{
	public static String digitsNum(int n)
	{
		StringBuilder str = new StringBuilder();
		int temp = n;
		while(n!=0)
		{
			if(n>=9)
			{
				str.append("9");
				n-=9;
			}
			else
			{
				str.append(n);
				n=0;
			}
				
		}
		str.reverse();
		for(int i=0;i<temp;i++)
			str.append("0");
		return str.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(digitsNum(5));
	}

}
