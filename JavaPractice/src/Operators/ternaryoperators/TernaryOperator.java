package Operators.ternaryoperators;

public class TernaryOperator 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
        
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max); // 10
	}
}
