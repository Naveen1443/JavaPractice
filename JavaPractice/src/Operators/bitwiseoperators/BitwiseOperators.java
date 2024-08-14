package Operators.bitwiseoperators;

public class BitwiseOperators 
{
	public static void main(String[] args) 
	{
		int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        
        System.out.println("a & b : " + (a & b)); // 0001 -> 1
        System.out.println("a | b : " + (a | b)); // 0111 -> 7
        System.out.println("a ^ b : " + (a ^ b)); // 0110 -> 6
        System.out.println("~a    : " + (~a));       // 1010 -> -6
        System.out.println("a << 1: " + (a << 1)); // 1010 -> 10
        System.out.println("a >> 1: " + (a >> 1)); // 0010 -> 2
        System.out.println("a >>> 1:" + (a >>> 1)); // 0010 -> 2
	}
}
/*
1.Bitwise AND (&):

Operation: a & b
Explanation: This operator performs a bitwise AND on each pair of corresponding bits in a and b.
 			 If both bits are 1, the resulting bit is 1. Otherwise, it is 0.
Example:
	a = 5 (binary 0101)
	b = 3 (binary 0011)
	a & b = 0101 & 0011 = 0001 (binary 0001), which is 1 in decimal.
	
	
2.Bitwise OR (|):

Operation: a | b
Explanation: This operator performs a bitwise OR on each pair of corresponding bits in a and b.
 			 If at least one of the bits is 1, the resulting bit is 1. Otherwise, it is 0.
Example:
	a = 5 (binary 0101)
	b = 3 (binary 0011)
	a | b = 0101 | 0011 = 0111 (binary 0111), which is 7 in decimal.
	
	
3.Bitwise XOR (^):

Operation: a ^ b
Explanation: This operator performs a bitwise XOR on each pair of corresponding bits in a and b. 
			 If the bits are different, the resulting bit is 1. If they are the same, the resulting bit is 0.
Example:
	a = 5 (binary 0101)
	b = 3 (binary 0011)
	a ^ b = 0101 ^ 0011 = 0110 (binary 0110), which is 6 in decimal.	
	
	
4.Bitwise NOT (~):

Operation: ~a
Explanation: This operator inverts each bit in a.
 			 In Java, the bitwise NOT operator also includes the sign bit, leading to a two's complement representation.
Example:
	a = 5 (binary 0101)
	~a = ~0101 = 1010 (binary 1010)
	In two's complement, this represents -6.	


5.Left Shift (<<):

Operation: a << 1
Explanation: This operator shifts the bits of a to the left by 1 position, filling the rightmost bit with 0. 
			 Each shift to the left effectively multiplies the number by 2.
Example:
	a = 5 (binary 0101)
	a << 1 = 1010 (binary 1010), which is 10 in decimal.


6.Right Shift (>>):

Operation: a >> 1
Explanation: This operator shifts the bits of a to the right by 1 position, filling the leftmost bit with the 
			 sign bit (0 for positive numbers, 1 for negative numbers). Each shift to the right effectively 
			 divides the number by 2.
Example:
	a = 5 (binary 0101)
	a >> 1 = 0010 (binary 0010), which is 2 in decimal.

7.Unsigned Right Shift (>>>):

Operation: a >>> 1
Explanation: This operator shifts the bits of a to the right by 1 position, filling the leftmost bit 
			 with 0 regardless of the sign of the number. This operator treats the number as unsigned.
Example:
	a = 5 (binary 0101)
	a >>> 1 = 0010 (binary 0010), which is 2 in decimal
*/