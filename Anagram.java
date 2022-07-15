package trial;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean status=Arrays.equals(ch1, ch2);
		if (status==true)
			System.out.println("Its A Anagram String");
		else
			System.out.println("Its Not A Anagram String");
	}

}
