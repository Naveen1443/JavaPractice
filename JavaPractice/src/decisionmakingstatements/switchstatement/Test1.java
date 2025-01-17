//switch statement with integer
package decisionmakingstatements.switchstatement;

public class Test1 
{
	public static void main(String[] args) 
	{
        int day = 3;
        String dayName;

        switch (day) 
        {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is: " + dayName);
    }
}
/*
Decision-Making Statements in Java: switch Statement
							The switch statement in Java is another decision-making statement used 
							when you have multiple possible outcomes for a single variable. It’s an 
							alternative to using multiple if-else statements and can make your code more 
							readable and easier to maintain when dealing with multiple conditions based on 
							a single expression.

switch Statement
Definition:The switch statement evaluates the value of an expression (usually a variable) and compares it 
		   against multiple cases. If a match is found, the code block associated with that case is executed.
		   If no match is found, the default case (if provided) is executed.
*/