package cp;
import java.util.*;
public class CamelCase_Pattern_Matching 
{
	public static ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern)
    {
		ArrayList<String> ans = new ArrayList<String>();
		for(String i:Dictionary)
		{
			String temp = "";
			for(char j:i.toCharArray())
			{
				if(Character.isUpperCase(j))
					temp+=j;
				if(temp.equals(Pattern))
				{
					ans.add(i);
					break;
				}
			}
		}
		if(ans.size()==0)
			ans.add("-1");
		Collections.sort(ans);
		return ans;
    }
	public static void main(String[] args) 
	{
		String Dictionary[]={"Hi","Hello","HelloWorld","HiTech","HiGeek","HiTechWorld","HiTechCity","HiTechLab"};
		String Pattern="HA";
		System.out.println(CamelCase(Dictionary.length,Dictionary,Pattern));
	}
}