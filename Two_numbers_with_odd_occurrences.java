package cp;
public class Two_numbers_with_odd_occurrences 
{
	 public static int[] twoOddNum(int Arr[], int N)
	 {
		 int xor=Arr[0];
	     for(int i=1;i<N;i++)
	    	 xor^=Arr[i];
	     int last_set_bit=(xor & (~(xor-1)));
	     int x=0,y=0;
	     for(int i=0;i<N;i++)
	    	 if((Arr[i] & last_set_bit)==0)
	    		 x^=Arr[i];
	    	 else
	    		 y^=Arr[i];
	     return new int[]{Math.max(x,y),Math.min(x,y)};
	 }
	public static void main(String[] args) 
	{
		int arr[] = {1, 7, 5, 7, 5, 4, 7, 4};
		arr=twoOddNum(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
