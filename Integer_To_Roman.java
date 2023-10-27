package cp;
import java.util.*;
public class Integer_To_Roman 
{
	public static String integer_to_roman(int n)
	{
		String ans="";
		int num[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String roman[]= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		for(int i=12;i>=0;i--)
		{
			int temp=n/num[i];
			for(int j=0;j<temp;j++)
				ans+=roman[i];
			n-=(temp*num[i]);
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no you want to convert to roman ");
		int x=sc.nextInt();
		System.out.println(x+" in roman is "+integer_to_roman(x)); //MCMXCIV
		sc.close();
	}
}