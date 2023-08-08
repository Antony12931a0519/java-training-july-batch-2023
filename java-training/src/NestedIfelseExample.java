package test;

public class NestedIfelseExample {
	static int a = 100;
	static int b = 2000;
	static int c = 3066660;
	static int d = 10000;

	public static void main(String[] args) {

		if (d > a && d > b && d > c) {

			System.out.println(d + " is bigger value than  " + a + " and " + b + " and " + c);

		} else if (b > a && b > c && b > d) {
			System.out.println(b + " is bigger value than  " + a + " and " + c + " and " + d);
		} else if (c > a && c > b && c > d) {
			System.out.println(c + " is bigger value than  " + a + " and " + b + " and " + d);
		} else if (a > d && a > b && a > c) {
			System.out.println(a + " is bigger value than  " + b + " and " + c + " and " + d);
		}

	}

}
