package cp;

public class A_Special_Keyboard 
{
	 static int findTime(String S1 , String S2) 
	 {
		 int sum=0 , prev=0;
		 for(int i=0;i<S2.length();i++)
		 {
			 int temp = S1.indexOf(S2.charAt(i));
			 sum = sum + Math.abs(prev-temp);
			 prev = temp;
		 }
		 return sum;
	 }
	public static void main(String[] args)
	{
		String S1 = "nrwzqfgcbyepitsljuaxmvkhdo";
		String S2 = "rmzdmywb";
		System.out.println(findTime(S1,S2));
	}
}
