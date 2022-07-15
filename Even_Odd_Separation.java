package cp;

public class Even_Odd_Separation 
{
	public static void reArrange(int[] arr, int n) 
    {
        // code here
		int evenInd = 0 , oddInd = 1;
        while (true)
        {
            while (evenInd < n && arr[evenInd] % 2 == 0)
                evenInd += 2;
            while (oddInd < n && arr[oddInd] % 2 == 1)
                oddInd += 2;
            if (evenInd < n && oddInd < n)
                {
                    int temp = arr[evenInd];
                    arr[evenInd] = arr[oddInd];
                    arr[oddInd] = temp;
                }
                  
            else
                break;
        }
    }
	public static void main(String[] args) 
	{
		int a[]= {10, 9, 7, 18, 13, 19, 4, 20, 21, 14};
		reArrange(a,a.length);
		for(int i:a)
			System.out.print(i+" ");
	}

}
