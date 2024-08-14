//String pre-defined methods
package methods.predefined;

public class Stringmethods 
{
	public static void main(String[] args) 
	{
		String text = "Hello, world! There";
		
		//using substring method
		String sub = text.substring(7, 19);
		System.out.println("SubString : " + sub);
		
		//using toUpperCase method
		String upper = text.toUpperCase();
		System.out.println("Uppercase : " + upper);
		
		//using toLowerCase method
		String lower = text.toLowerCase();
		System.out.println("Lowercase : " + lower);
		
		//using charAt method
		char character = text.charAt(1);
		System.out.println("Character At index 1 : " + character);
	}
}