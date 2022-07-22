
public class OOP_Q02 {

	/*
	 * 2. Write a program for Method Overloading Example
	 */

	static int divisionMethod(int x, int y) {
		return x / y;
	}

	static double divisionMethod(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		int calculation1 = divisionMethod(4, 2);

		double calculation2 = divisionMethod(9.9, 3.3);

		System.out.println("Calculation 1 is: " + calculation1);
		System.out.println("Calculation 2 is: " + calculation2);

	}

}
