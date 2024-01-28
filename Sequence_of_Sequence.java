package cp;
public class Sequence_of_Sequence 
{
	public static int numberSequence(int m, int n)
    {
		if(n==0)
			return 1;
		if(m<n)
			return 0;
		return numberSequence(m/2, n-1)+numberSequence(m-1, n);
    }
	public static void main(String[] args) 
	{
		System.out.println(numberSequence(10,4));//4
	}
}