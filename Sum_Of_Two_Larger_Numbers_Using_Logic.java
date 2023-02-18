package cp;

public class Sum_Of_Two_Larger_Numbers_Using_Logic 
{
	public static String findSum(String X, String Y) 
    {
		String ans = "";
		int i = X.length()-1,j=Y.length()-1,carry=0;
		while(i>=0 || j>=0 || carry!=0)
		{
			int sum = 0;
			if(i>=0)
				sum+=Character.getNumericValue(X.charAt(i--));
			if(j>=0)
				sum+=Character.getNumericValue(Y.charAt(j--));
			sum+=carry;
			carry=sum/10;
			ans=Integer.toString(sum%10)+ans;
		}
		int ind = 0;
		for(ind = 0;ind<ans.length();ind++)
			if(ans.charAt(ind)!='0')
				break;			
		if(ind==ans.length())
			return "0";
		return ans.substring(ind);
    }
	public static void main(String[] args)
	{
//		System.out.println(findSum("000000","00000000000"));
		System.out.println(2345/10);
	}

}
