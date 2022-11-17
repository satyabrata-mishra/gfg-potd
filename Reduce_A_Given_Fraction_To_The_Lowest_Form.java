package cp;
public class Reduce_A_Given_Fraction_To_The_Lowest_Form 
{
	public static int gcd(int x,int y)
	{
		int gcd=Math.min(x, y);
		while(gcd>=1)
		{
			if(x%gcd==0 && y%gcd==0)
				break;
			--gcd;
		}
		return gcd;
	}
	public static void reduceFraction(int x, int y)
	{
		int gcd=gcd(x,y);
		x/=gcd;
		y/=gcd;
		System.out.println(x+"/"+y);
	}
	public static void main(String[] args) 
	{
		reduceFraction(45,55);
	}

}
