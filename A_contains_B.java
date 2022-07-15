package trial;

import java.util.Scanner;

public class Day7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		String B=sc.nextLine();
		int temp=1;
		while(true)
		{
			if (A.contains(B))
				break;
			else
			{
				A=A+A;
				++temp;
			}
		}
		System.out.println(temp);
	}

}