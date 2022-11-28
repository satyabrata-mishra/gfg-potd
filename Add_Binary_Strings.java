package cp;
public class Add_Binary_Strings 
{
	public static String addBinary(String A, String B) 
    {
		StringBuilder ans = new StringBuilder();
		int i=A.length()-1,j=B.length()-1,carry=0;
		while(i>=0 && j>=0)
		{
			int a = Character.getNumericValue(A.charAt(i));
			int b = Character.getNumericValue(B.charAt(j));
			ans.append(a^b^carry);
			carry = (a&b) | (b&carry) | (carry&a);
			i--;j--;
		}
		while(i>=0)
		{
			int a = Character.getNumericValue(A.charAt(i));
			ans.append(a^carry);
			carry = a&carry;
			--i;
		}
		while(j>=0)
		{
			int b = Character.getNumericValue(B.charAt(j));
			ans.append(b^carry);
			carry = b&carry;
			--j;
		}
		ans.append(carry);
		ans.reverse();
		int zero=0;
		for(;zero<ans.length();zero++)
			if(ans.charAt(zero)=='1')
				break;
		return ans.toString().substring(zero);
    }
	public static void main(String[] args)
	{
		System.out.println(addBinary("1101","111"));
	}

}
