package cp;
import java.util.*;
public class Find_Total_Time_Taken 
{
	public static long totalTime(int n,int arr[],int time[])
    {
		HashMap<Integer , Integer> map = new HashMap<>();
        long timeTaken = -1;
        for(int i = 0 ; i < n ; i++)
        {
            if(map.containsKey(arr[i]))
                timeTaken = timeTaken + time[arr[i]-1];
            else
            {
                map.put(arr[i] , time[i]);
                timeTaken++;    
            }
            
        }
        return timeTaken;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 3};
		int time[] = {1, 2, 3, 4};
		System.out.println(totalTime(arr.length,arr,time));
	}

}
