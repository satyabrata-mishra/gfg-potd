package cp;
public class Fraction_Trouble
{
	public static int[] numAndDen(int n, int d)
    {
        // code here
		int[] b = new int[2];
	    long max = Integer.MIN_VALUE;
	    for(int q =10000;q>=2;q--)
	       {
	           int p = ((q*n)-1)/d;
	           long v = ((long)p*(long)10000000)/(long)(q);
	           if(max<v && p<=q) 
	           {
	        	   max=v;
	        	   b[0]=p;
	        	   b[1]=q;
	           }
	       }
	    return b;
    }
	public static void main(String[] args)
	{
		int n = 2, d = 4;
		int a[]=numAndDen(n,d);
		for(int i:a)
			System.out.print(i+" ");
	}

}
