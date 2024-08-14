/*
 Definition:
	A default constructor is automatically provided by the Java compiler if no other constructors are defined 
	in the class. It initializes object members with default values (e.g., 0 for integers, null for objects, etc.).
 */
package constructors;

public class DefaultConstructor 
{
	static class Car 
	{
	    String model;
	    int year;
	}
    public static void main(String[] args) 
    {
        Car car1 = new Car();  
        System.out.println("Model: " + car1.model);  // null
        System.out.println("Year: " + car1.year);    // 0
	}
}
/*
Explanation:
		Since no constructor is explicitly defined in the Car class, Java automatically provides
		 a default constructor that initializes model to null and year to 0.
*/