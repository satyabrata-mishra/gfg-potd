package cp;
public class Panagram_Checking 
{
	public static boolean checkPangram(String s)
	{
		s=s.toLowerCase();
		for(char i='a';i<='z';i++)
			if(!s.contains(""+i))
				return false;
		return true;
    }
	public static void main(String[] args) 
	{
		System.out.println(checkPangram("Bawds jog, flick quartz, vex nymph"));
		System.out.println(checkPangram("sdfs"));
	}
}