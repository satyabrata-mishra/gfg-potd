package cp;
public class Reverse_A_String_Using_Stack
{
	public static int  top=0;
	public static char a[]=new char[100];
	public static void push(char n)
	{
		a[top++]=n;		
	}
	public static char pop()
	{
		return a[--top];
	}
	 public static String reverse(String S)
	 {
		 for(int i=0;i<S.length();i++)
			 push(S.charAt(i));
		 String str="";
		 System.out.println(top);
		 for(int i=0;i<S.length();i++)
		 {
			 str+=pop();
		 }
		 return str;
	 }
	public static void main(String[] args)
	{
		System.out.print(reverse("gudu"));
	}

}
