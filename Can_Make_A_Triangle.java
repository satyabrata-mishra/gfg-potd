package cp;

public class Can_Make_A_Triangle 
{
	public static int[] canMakeTriangle(int A[], int N) 
    { 
        // code here
		int newarray[]=new int[N-2];
		for(int i=0;i<N-2;i++)
			if(A[i]+A[i+1]>A[i+2] && A[i]+A[i+2]>A[i+1] && A[i+2]+A[i+1]>A[i])
				newarray[i]=1;
			else
				newarray[i]=0;
		return newarray;
    }
	public static void main(String[] args)
	{
		int A[] = {1, 2, 2, 4};
		int s[]=canMakeTriangle(A,A.length);
		for(int i:s)
			System.out.print(i+" ");
	}

}
