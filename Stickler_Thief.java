package cp;
public class Stickler_Thief 
{
	public int FindMaxSum(int arr[], int n)
    {
		int notTaken=0, taken=0;
        for(int money:arr)
        {
            int currSum=money+taken;
            taken=Math.max(taken, notTaken);
            notTaken=Math.max(currSum, taken);
        }
        return Math.max(notTaken, taken);
    }
	public static void main(String[] args) 
	{
		Stickler_Thief ob = new Stickler_Thief();
		int a[] = {9, 4, 11, 12, 6, 12}; //33
		System.out.println(ob.FindMaxSum(a,a.length));
	}
}