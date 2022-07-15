package cp;
import java.util.*;
public class Missing_Number_In_Array
{
	public static int MissingNumber(int array[], int n) 
    {
		if(array.length==1 && array[0]==1)
            return 2;
        else if(array.length==1 && array[0]==2)
            return 1;
        else
        {
        	Arrays.sort(array);
	   		int temp=0;
	   		for(int i:array)
	   		{
	   			++temp;
	   			if(i!=temp)
	   				return temp;
	   		}
	   		return ++temp;
        }
    }
	public static void main(String[] args) 
	{
		int num[]= {1,2,3,5};
		System.out.println(MissingNumber(num,5));
	}

}
