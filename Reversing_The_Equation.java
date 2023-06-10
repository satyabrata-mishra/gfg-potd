package cp;
public class Reversing_The_Equation 
{
	public static String reverseEqn(String S)
    {
		String ans = "",temp="";
		for(int j=0;j<S.length();j++)
		{
			char i = S.charAt(j);
			if(i>=48 && i<=57)
				temp+=i;
			else
			{
				ans=i+temp+ans;
				temp="";
			}
		}
		ans=temp+ans;
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(reverseEqn("20-3+5*2"));
		System.out.println(reverseEqn("5+2*56-2/4"));
	}
}