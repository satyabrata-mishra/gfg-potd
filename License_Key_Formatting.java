package cp;

public class License_Key_Formatting 
{
	public static String ReFormatString(String S, int K)
    {
		char arr[]=S.toCharArray();
	       StringBuilder sb=new StringBuilder();
	       int len=0;
	       for(int i=arr.length-1;i>=0;i--)
	       {
	           if(arr[i]!='-')
	           {   
	        	   sb.append(arr[i]+"");
	        	   len++;
	               if(len==K)
	               {
	                   sb.append('-'+"");
	                   len=0;
	               }
	           }
	       }
	       String ans=sb.reverse().toString().toUpperCase();
	       if(ans.length()==0) 
	    	   return "";
	       if(ans.charAt(0)=='-') 
	    	   return ans.substring(1);
	       return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(ReFormatString("5F3Z-2e-9-w",4));
		System.out.println(ReFormatString("2-5g-3-J",2));
		System.out.println(ReFormatString("-yD-tuI-wm-9sCUp5",13));
		
	}

}
