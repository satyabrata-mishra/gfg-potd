package cp;
public class Check_if_string_is_rotated_by_two_places 
{
	public static String rotate(String s,boolean isRight,int places)
	{
		if(isRight)
			return s.substring(places) + s.substring(0, places);
		else
			return s.substring(s.length()-places)+s.substring(0,s.length()-places);
	}
	public static boolean isRotated(String str1, String str2)
    {
		return  rotate(str1,false,2).equals(str2)||rotate(str1,true,2).equals(str2);
    }
	public static void main(String[] args)
	{
		String a="daxjheq",b="eqdaxjh";
		System.out.println(isRotated(a, b)?"1":"0");
	}
}