package cp;
import java.util.*;
public class Buy_Maximum_Stocks_if_i_stocks_can_be_bought_on_i_th_day
{
	public static int buyMaximumProducts(int n, int k, int[] price) 
    {
		int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
        	arr[i][0]=price[i];
        	arr[i][1]=i+1;
        }
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        int ans=0;
        for(int i=0;i<n && k>=arr[i][0];i++)
        {
        	int cost=arr[i][0],avaliable_stocks=arr[i][1];
        	int can_be_bought=k/cost;
        	if(can_be_bought>=avaliable_stocks)
        	{
        		ans+=avaliable_stocks;
        		k-=cost*avaliable_stocks;
        	}
        	else
        	{
        		ans+=can_be_bought;
        		k-=can_be_bought*cost;
        	}
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int price[] =  {5, 10, 10, 2, 1, 7, 8, 9, 5, 3}; //7
		int k=9;
		System.out.println(buyMaximumProducts(price.length,k,price));
	}
}