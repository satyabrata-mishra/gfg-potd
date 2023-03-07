package cp;
public class Fill_The_Matrix 
{
	public static int minIteration(int N, int M, int x, int y)
	{
		int ans = 0, X = x-1 , Y = y -1;
		//top left 
		ans = Math.max(ans , X+Y );
		//bottom left
		ans = Math.max(ans , (N-(X+1))+Y);
		//top right
		ans = Math.max(ans , X + (M-(Y+1)) );
		// bottom right
		ans = Math.max(ans,(N-(X+1))+(M-(Y+1)) );
		return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(minIteration(2,3,2,3));
	}

}
