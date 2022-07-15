package cp;
public class Min_X_XOR_A 
{
	public static int minVal(int a, int b)
    {
		int bitsA = Integer.bitCount(a);
		int bitsB = Integer.bitCount(b);
	    if(bitsA == bitsB)
	        return a;
	    while(bitsA > bitsB)
	    {
	        a = a&(a-1);
	        bitsA--;
	    }
	    while(bitsA < bitsB)
	    {
	        a = a|(a+1);
	        bitsB--;
	    }
	    return a;
    }
	public static void main(String[] args) 
	{
		int a = 3,b=5;
		System.out.println(minVal(a,b));
	}

}
