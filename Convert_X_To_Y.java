package cp;

public class Convert_X_To_Y 
{
	public static int minOperations(int x,int y)
	{
		if (x == y)
            return 0;
        if (x <= 0 && y > 0)
            return -1;
        if (x > y)
            return x - y;
        if (y % 2 != 0)
            return 1 + minOperations(x, y + 1);
        else
            return 1 + minOperations(x, y / 2);
	}
	public static void main(String[] args) 
	{
		int x=2,y=5;
		System.out.println(minOperations(x,y)+" Steps Are Required.");
	}

}
