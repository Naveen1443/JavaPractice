//switch statement with String
package decisionmakingstatements.switchstatement;

public class Test2 
{
	public static void main(String[]args)
	{
		String fruit = "Apple";
		switch (fruit)
		{
		 case "Apple":
			 System.out.println("Apple is red.");
			 break;
		 case "Banana":
		 	System.out.println("Banana is yellow");
		 	break;
		 case "Grapes":
             System.out.println("Grapes are green or purple.");
             break;
         default:
             System.out.println("Unknown fruit.");
             break;
		}
	}
}
