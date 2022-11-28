package cp;

public class Number_Of_Open_Doors 
{
	static int noOfOpenDoors(Long N) 
    {
        return (int)Math.sqrt(N);
    }
	public static void main(String[] args) 
	{
		System.out.println(noOfOpenDoors(2l));
	}

}
