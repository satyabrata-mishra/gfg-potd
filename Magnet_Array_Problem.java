package cp;
public class Magnet_Array_Problem 
{
	public static void nullPoints(int n, double magnets[], double getAnswer[])
    {
		for(int i = 0; i < n - 1; i++)
		{
            double low = magnets[i], high = magnets[i + 1];
            while((high - low) >= 0.000001)
            {
                double mid = (high+low)/2;
                double p = 0;
                for(int k = 0; k < n; k++)
                    if(k <= i)
                        p += (double)1/(mid - magnets[k]);
                    else
                        p -= (double)1/(magnets[k] - mid);
                if(p >= (double)0)
                    low = mid;
                else
                    high = mid;
            }
            getAnswer[i] = high;
		}
    }
	public static void main(String[] args) 
	{
		double magnets[] ={0, 10, 20, 30};
		double getAnswer[] = new double[magnets.length-1];
		nullPoints(magnets.length,magnets,getAnswer);
		for(int i=0;i<getAnswer.length;i++)
			System.out.print(getAnswer[i]+" ");
	}

}
