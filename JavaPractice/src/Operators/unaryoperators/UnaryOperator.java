package Operators.unaryoperators;

public class UnaryOperator 
{
	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println("+a: " + (+a));   // 5
        System.out.println("-a: " + (-a));   // -5
        
        System.out.println("a++: " + (a++)); // 5
        System.out.println("a: " + a);       // 6
        
        System.out.println("++a: " + (++a)); // 7
        
        System.out.println("a--: " + (a--)); // 7
        System.out.println("a: " + a);       // 6
        
        System.out.println("--a: " + (--a)); // 5
        
        boolean b = false;
        System.out.println("!b: " + (!b));   // true
	}
}
