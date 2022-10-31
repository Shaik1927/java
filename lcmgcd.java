import java.io.*;

class GFG {

	static int gcd(int a, int b) {
		
				if (b == 0)
			return a;
		
		
		else
			return gcd(b, a % b);
	}

	static int lcm(int a, int b, int gcdValue)
	{
		return Math.abs(a * b) / gcdValue;
	}

	public static void main(String[] args) {

		int a = 20, b = 30, gcdValue;
		gcdValue = gcd(a, b);
		
		System.out.println("GCD = " + gcdValue);
		
		System.out.println("LCM = " + lcm(a, b, gcdValue));
	}
}
