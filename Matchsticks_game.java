package cp;

public class Matchsticks_game 
{
	public static int matchGame(Long N) 
    {
		if(N%5==0)
            return -1;
        return (int)(N%5);
    }
	public static void main(String[] args) 
	{
		System.out.println(matchGame(48L));
	}

}
