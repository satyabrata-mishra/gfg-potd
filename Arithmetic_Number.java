package cp;

public class Arithmetic_Number 
{
	static int inSequence(int A, int B, int C)
    {
        if(C == 0) 
            return A == B?1:0;
        return ((B - A) % C == 0) && ((B - A) / C >= 0)?1:0;
    }
	public static void main(String[] args) 
	{
		System.out.println(inSequence(1,3,2)==1?"True":"False");
	}

}
