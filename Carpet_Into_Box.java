package cp;
public class Carpet_Into_Box 
{
	public static int count(int a,int b,int c,int d)
	{
		int moves=0;
		while(a>c||b>d)
		{
			if(a>c)
			{
				moves++;
				a/=2;
			}
			if(b>d)
			{
				moves++;
				b/=2;
			}
		}
		return moves;
	}
	public static int carpetBox(int A, int B, int C, int D) 
    {
		return Math.min(count(A,B,C,D), count(B,A,C,D));
    }
	public static void main(String[] args) 
	{
		System.out.println(carpetBox(8,13,6,10));
	}

}
