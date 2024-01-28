// 1 
// 2 9 
// 3 8 10 
// 4 7 11 14 
// 5 6 12 13 15
package cp;
public class Pattern_3 
{
	public static void pattern(int n)
	{
		int matrix[][]=new int[n][n];
		int counter=1;
		boolean toogle=true;
		for(int j=0;j<n;j++,toogle=!toogle)
		{
			if(toogle)
			{
				for(int i=j;i<n;i++)
					matrix[i][j]=counter++;
			}
			else
			{
				for(int i=n-1;i>=j;i--)
					matrix[i][j]=counter++;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n && matrix[i][j]!=0;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern(5);
	}
}
