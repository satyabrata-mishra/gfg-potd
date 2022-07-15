package cp;
import java.util.*;
public class Find_Missing_And_Repeating
{
	public static int[] findTwoElement1(int arr[], int n) 
    {
        HashSet<Integer> set = new HashSet<>();
        int[] result  = new int[2];
        //check duplicate
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                result[0]=arr[i];
            }   
            set.add(arr[i]);
        }
        //check smallest positive missing number
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                result[1] = i;
                break;
            }
        }
        return result;
    }
	public static int[] findTwoElement2(int arr[], int n)
	{
        int a[]=new int[2];
        for(int i=0;i<n;i++)
        {
        	int count=0;
        	for (int j=0;j<n;j++)
        			if(arr[i]==arr[j])
        				++count;
        	if(count==2)
        		a[0]=arr[i];
        }
        for (int i=1;i<=n;i++)
        {
        	int temp=0;
        	for(int j=0;j<n;j++)
        		if(arr[j]==i)
        		{
        			temp=1;
        			break;
        		}
        	if(temp==0)
        	{
        		a[1]=i;
        		break;
        	}
        }
        return a;
    }
	public static void main(String[] args) 
	{
		int arr[]= {1,3,3};
		int a[]=findTwoElement2(arr,arr.length);
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
