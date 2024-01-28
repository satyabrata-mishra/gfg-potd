package cp;
import java.util.*;
public class Minimum_number_of_candies 
{
	public static int minCandies(int[] ratings) 
	{
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) 
            if (ratings[i] > ratings[i - 1]) 
                candies[i] = candies[i - 1] + 1;
        for (int i = n - 2; i >= 0; i--) 
            if (ratings[i] > ratings[i + 1]) 
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        int totalCandies = 0;
        for (int i = 0; i < n; i++) 
            totalCandies += candies[i];
        return totalCandies;
    }
	public static void main(String[] args) 
	{
		int[] ratings = {1, 0, 2};
        System.out.println(minCandies(ratings));
	}
}