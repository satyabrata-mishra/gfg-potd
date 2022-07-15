// package trial;

public class Revesing_Each_Word_In_A_Given_Sentence 
{
	public static String rev(String s)
	{
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		return str;
	}
	public static String reverseWords(String s)
	{
		String str[]=s.split("\\.");
		for (int i=0;i<str.length;i++)
		{
			str[i]=rev(str[i]);
		}
		String str1="";
		for (int i=0;i<str.length;i++)
		{
			str1=str1+str[i]+".";
		}
		str1=str1+str[str.length-1];
		return str1;
	}
	public static void main(String[] args)
	{
		System.out.println(reverseWords("b..bbtdidee.jw.x.h.tw.a...ew.rpxxf..zfjfg.ur.tlk.adw...fi.hw.sr...tqtiukb.fxm.jd.thmt.c.gcmig..w.wjj.ri.dxjf.skxtijbrjid.m.zt..hlc.dw..."));
	}
}
