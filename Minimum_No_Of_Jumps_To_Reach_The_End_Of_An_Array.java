//Asked in Microsoft technical interview - 2 round
package cp;
public class Minimum_No_Of_Jumps_To_Reach_The_End_Of_An_Array 
{
	public static int minJumps(int arr[])
	{
		int des = 0,pos = 0,jump = 0;
        for(int i = 0; i<arr.length-1; i++) 
        {
            if( i == pos && pos == des && arr[i] == 0 )
            	return -1;
            des = Math.max(arr[i] + i, des);
            if(pos == i) 
            {
                pos = des;
                jump++;
            } 
        }
        return jump;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));
	}

}
