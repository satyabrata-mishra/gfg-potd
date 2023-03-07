/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
package cp;
public class Pattern_1 
{
	public static void pattern(int n)
	{
		String temp = "";
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
				System.out.print(" ");
			System.out.print(temp+"*"+temp);
			temp=temp+"*";
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(" ");
			temp=temp.substring(0,temp.length()-1);
			System.out.print(temp+"*"+temp);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern(3);
	}
}