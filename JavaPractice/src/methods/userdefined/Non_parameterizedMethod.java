package methods.userdefined;

import java.time.LocalTime;
public class Non_parameterizedMethod 
{
	public static void printCurrentTime()
	{
		LocalTime currentTime = LocalTime.now();
		System.out.println("The current time is : " + currentTime);
	}
	public static void main(String[]args)
	{
		printCurrentTime();
	}
}
/*
Explanation
	
Non-parameterized Methods:  These methods do not take any input parameters.
							The printCurrentTime method prints the current time without needing any input.
 							By using user-defined methods, programmers can modularize their code,
							making it more maintainable and understandable.

*/