package decisionmakingstatements.nestedif;

public class Test 
{

	public static void main(String[] args) 
	{
		int n = 0;
		if(n > 0)
		{
			System.out.println("The number is positive");
		}
		else if( n < 0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
