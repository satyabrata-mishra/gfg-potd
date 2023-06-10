package cp;
import java.util.*;
public class Expression_Add_Operations 
{
	public static ArrayList<String> addOperators(String S, int target) 
    {
        ArrayList<String> result = new ArrayList<>();
        backtrack(result, S, target, "", 0, 0, 0);
        return result;
    }
    private static void backtrack(List<String> result, String num, int target, String expr, int index, long eval, long prev) 
    {
        if (index == num.length()) 
        {
            if (eval == target)
                result.add(expr);
            return;
        }
        for (int i = index; i < num.length(); i++)
        {
            if (i != index && num.charAt(index) == '0') 
                break; // Avoid leading zeros in operands
            long current = Long.parseLong(num.substring(index, i + 1));
            if (index == 0) 
                backtrack(result, num, target, expr + current, i + 1, current, current);
            else 
            {
                backtrack(result, num, target, expr + "+" + current, i + 1, eval + current, current);
                backtrack(result, num, target, expr + "-" + current, i + 1, eval - current, -current);
                backtrack(result, num, target, expr + "*" + current, i + 1, eval - prev + prev * current, prev * current);
            }
        }
    }
	public static void main(String[] args) 
	{
		System.out.println(addOperators("123",6));
	}
}