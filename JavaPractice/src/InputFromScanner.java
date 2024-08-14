//How to take inputs dynamically in java using scanner class

import java.util.*;
public class InputFromScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Read a String
		System.out.print("Enter your Name : ");
		String name = sc.next();
		System.out.println("Your name is : "+name);
		
		//Read a Integer
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		System.out.println("Your age is : "+age);
		
		// Read a double
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        System.out.println("Your height is: " + height + " meters");
		sc.close();
	}
}
