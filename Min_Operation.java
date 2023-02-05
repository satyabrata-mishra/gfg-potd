//Given two numbers a and b. In one operation you can pick 
//any non negative integer x and either of a or b. 
//Now if you picked a then replace a with a&x 
//else if you picked b then replace b with b&x.
package cp;
public class Min_Operation 
{
	public static int solve(int a, int b) 
    {
        if (a == b)
            return 0;
        else if ((a & b) == Math.min(a, b))
            return 1;
        else
            return 2;
    }
	public static void main(String[] args) 
	{
		System.out.println(solve(5,12));
	}

}
