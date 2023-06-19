package cp;
public class Adding_Ones 
{
	public static void update(int a[], int n, int updates[], int k)
    {
		for(int  i : updates) 
			a[i-1]++;
		for(int i = 1;i<n;i++) 
			a[i] += a[i-1];
    }
	public static void main(String[] args) 
	{
		int updates[]= {1, 1, 2, 3};
		int a[]= {0,0,0};
		update(a,a.length,updates,updates.length);
		for(int i:a)
			System.out.print(i+" ");
	}
}