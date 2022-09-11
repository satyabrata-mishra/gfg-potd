package cp;
//Given n balls. All of them are initially  uncolored. 
//You have to color the balls with two colors RED and BLUE 
//such that there can be atmost 2 positions where 
//a RED ball is touching BLUE ball or vice versa. 
//You have to color all the balls.
//Find the number of ways in which balls can be colored.
public class Ball_Coloring 
{
	static long noOfWays(long n)
    {
        return (n*(n-1))+2;
    }
	public static void main(String[] args) 
	{
		System.out.println(noOfWays(4));
	}

}
