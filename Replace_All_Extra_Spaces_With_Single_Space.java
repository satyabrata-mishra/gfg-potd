package cp;

public class Replace_All_Extra_Spaces_With_Single_Space 
{
	public static void main(String[] args)
	{
		String str="My    Cat,   Says    Meow,    Meow.";
		str = str.replaceAll("\\s+", " ");
		System.out.println(str);
	}

}
