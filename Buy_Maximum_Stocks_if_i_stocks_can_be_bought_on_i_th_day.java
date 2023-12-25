package cp;
import java.util.*;
class Stock
{
	int price,day;
	Stock(int price,int day)
	{
		this.price=price;
		this.day=day;
	}
}
public class Buy_Maximum_Stocks_if_i_stocks_can_be_bought_on_i_th_day 
{
	public static int buyMaximumProducts(int n, int k, int[] price) 
    {
		Stock ob[]=new Stock[n];
		for(int i=0;i<n;i++)
			ob[i]=new Stock(price[i],i+1);
		Arrays.sort(ob,(a,b)->a.price-b.price);
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(ob[i].price*ob[i].day<k)
			{
				ans+=ob[i].day;
				k-=ob[i].price*ob[i].day;
			}
			else
			{
				 ans+=k/ob[i].price;
				 break;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int price[]={10,7,19};
		int k=45;
		System.out.println(buyMaximumProducts(price.length,k,price));
	}
}