package cp;
import java.util.Arrays;
class Item
{
    int value, weight;
    Item(int x, int y)
    {
        this.value = x;
        this.weight = y;
    }
}
public class Fractional_Knapsack 
{
	public static double fractionalKnapsack(int W, Item arr[], int n) 
    {
		double ans=0;
		Arrays.sort(arr,(x,y)->Double.compare((double)y.value/y.weight,(double)x.value/x.weight));
		for(Item i:arr)
		{
			if(i.weight<=W)
			{
				ans+=i.value;
				W-=i.weight;
			}
			else
			{
				ans+=((double)i.value/i.weight)*W;
				break;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int W = 50;
		int value[] = {60,100},
		weight[] = {10,20};
		Item items[]=new Item[value.length];
		for(int i=0;i<value.length;i++)
			items[i]=new Item(value[i],weight[i]);
		System.out.println(fractionalKnapsack(W,items,value.length));
	}
}