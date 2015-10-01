package operation;

public class Operator {
	public static void main(String args[]) {
		int a = -16; /* 16 = 0001 1111 */
		int b = 13; /* 13 = 0000 1101 */
		double d = 33.5;

		testPostfix(a);
		testUnary(a);
		testMultiplicative(a, b, d);
		testAdditive(a, b);
		testShift(a);
		testBitwiseOperators(a, b);
	}

	public static void testPostfix(int a) {
		System.out.println("Test expr++ and expr-- with a==" + a + ":");
		System.out.println("	a (before): " + a);
		int b = a++;
		System.out.println("	b = a++ is " + b);
		System.out.println("	a (after): " + a);
		int c = a--;
		System.out.println("	c = a-- is " + c);
		System.out.println("	a (after): " + a);
	}

	public static void testUnary(int a) {
		System.out.println("\nTest ++expr and --expr with a==" + a + ":");
		System.out.println("	a (before): " + a);
		int b = ++a;
		System.out.println("	b = ++a: " + b);
		System.out.println("	a (after): " + a);
		int c = --a;
		System.out.println("	c = --a: " + c);
		System.out.println("	a (after): " + a);

		System.out.println("\nTest +expr and -expr with a==" + a + ":");
		System.out.println("	a: " + a);
		b = +a;
		System.out.println("	b = +a: " + b);
		c = -a;
		System.out.println("	c = -a: " + c);

		System.out.println("\nTest ~ and ! with a==" + a + ":");
		System.out.println("	a: " + a);
		b = ~a;
		System.out.println("	b = ~a: " + b);
		boolean d = !true;
		System.out.println("	!true: " + d);
	}

	public static void testMultiplicative(int a, int b, double d) {
		System.out.println("\nTest * / % with integer a==" + a + " integer b==" + b + " double d==" + d + ":");
		int c = a * b;
		System.out.println("	a*b=" + c);

		double d1 = d / b;
		double d2 = d % b;
		c = a / b;
		System.out.println("	a/b=" + c);
		c = a % b;
		System.out.println("	a%b=" + c);
		System.out.println("	d/b=" + d1);
		System.out.println("	d%b=" + d2);

	}

	public static void testAdditive(int a, int b) {
		System.out.println("\nTest + - with integer a==" + a + " and integer b==" + b + ":");
		int c = a + b;
		System.out.println("	a+b=" + c);
		c = a - b;
		System.out.println("	a-b=" + c);
	}

	public static void testShift(int a) {
		System.out.println("\nTest << >> >>> with integer a==" + a + ":");
		int b = a >> 3;
		System.out.println("	a >> 3 = " + b);
		b = a << 1;
		System.out.println("	a << 1 = " + b);
		b = a >>> 3;
		System.out.println("	a >>> 3 = " + b);
	}

	public static void testBitwiseOperators(int a, int b) {
		System.out.println("\nTest Bitwise Operators with integer a==" + a + " and b==" + b + ":");
		int c = a & b;
		System.out.println("	AND: a & b = " + c);
		c = a | b;
		System.out.println("	OR: a | b = " + c);
		c = a ^ b;
		System.out.println("	XOR: a ^ b = " + c);
	}
}
