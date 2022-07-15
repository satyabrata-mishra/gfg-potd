package cp;
public class Excel_Sheet_Part1 
{
	public static String excelColumn(int N)
    {
       char[] arr = new char[27];
       String ans="";
       int i=1;
       for(char a='A';a<='Z';a++,i++)
           arr[i]=a;
       if(N<=26)
          ans+=arr[N];
       else{
           while(N>26){
               if(N%26==0){
                   ans=arr[26]+ans;
                   N=(N/26)-1;
               }
               else{
                   ans=arr[N%26]+ans;
                   N=N/26;
               }
           }
           ans=arr[N]+ans;
       }
       return ans;
}
	public static void main(String[] args)
	{
		System.out.println(excelColumn(27));
//		For N =1 we have column A, for 27 we have AA and so on.
	}

}
