package cp;

public class Find_N_th_Character 
{
	public static char nthCharacter1(String S, int R, int N)
	{
		for(;R>0;N%=1<<R--)
			S=S.charAt(N/(1<<R))=='0'?"01":"10";
		return S.charAt(N);		
	}
	public static char nthCharacter(String S, int R, int N)
    {
		for(int i=0;i<R;i++)
		{
			String temp="";
			for(int j=0;j<S.length();j++)
			{
				if(S.charAt(j)=='1')
					temp+="10";
				else
					temp+="01";
			}
			S=temp;
		}
		return S.charAt(N);
    }
	public static void main(String[] args) 
	{
		System.out.println(nthCharacter("101",2,3));
	}

}
