package cp;
import java.util.*;
public class Grey_Code_Sequence 
{
	public static ArrayList<String> generateCode(int n)
    {
		 ArrayList<String> list = new ArrayList<>();
	     list.add("0");
	     list.add("1");
	     for(int i=1;i<n;i++)
	     {
	    	 for(int j=list.size()-1;j>=0;j--)
	    		 list.add(list.get(j));
	    	 for(int j=0;j<list.size()/2;j++)
	    		 list.set(j, "0"+list.get(j));
	    	 for(int j=list.size()/2;j<list.size();j++)
	    		 list.set(j, "1"+list.get(j));
	     }
	     return list;
    }
	public static void main(String[] args) 
	{
		System.out.println(generateCode(1));
		System.out.println(generateCode(2));
		System.out.println(generateCode(3));
	}
}