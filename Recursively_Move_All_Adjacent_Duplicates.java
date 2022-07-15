package cp;
public class Recursively_Move_All_Adjacent_Duplicates
{
	public static String rremove(String s) 
    {
		if(s.length()==0 || s.length()==1)
			return s;
		String str="";
		char ch[]=s.toCharArray();
		if(ch[0]!=ch[1])
			str+=ch[0];
		for(int i=1;i<ch.length-1;i++)
			if(ch[i]!=ch[i+1] && ch[i]!=ch[i-1])
				str+=ch[i];
		if(ch[ch.length-1]!=ch[ch.length-2])
			str+=ch[ch.length-1];
		if(str.equals(s))
			return s;		
		else
			return rremove(str);
    }
	public static void main(String[] args)
	{
		String str="geeksforgeek";
		System.out.println(rremove(str));
	}
}
