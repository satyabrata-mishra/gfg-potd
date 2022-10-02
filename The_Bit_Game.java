package cp;
public class The_Bit_Game 
{
	public static int swapBitGame(long N) 
    {
		int noof=Long.bitCount(N);
		if(noof%2==0)
			return 2;
		else 
			return 1;
    }
	public static void main(String[] args) 
	{
		System.out.println(swapBitGame(1));
	}

}
