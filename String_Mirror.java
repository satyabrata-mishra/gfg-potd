package cp;
public class String_Mirror 
{
	public static String stringMirror(String str) 
    {
		StringBuilder ans = new StringBuilder(""+str.charAt(0));
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i-1)>str.charAt(i) || (i>1 && str.charAt(i-1)==str.charAt(i)))
				ans.append(str.charAt(i));
			else 
				break;
		}
		return ans.toString()+ans.reverse().toString();
    }
	public static void main(String[] args) 
	{
//		System.out.println(stringMirror("bvdfndkn"));
//		System.out.println(stringMirror("casd"));
		System.out.println(stringMirror("nbgfugfbdsj"));
	}
}