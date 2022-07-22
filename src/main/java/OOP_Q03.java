public class OOP_Q03 {

	/*
	 * 3. Write a program for constructor Overloading Example
	 */

	public static class Sandwich {

		String ham;
		String cheese;
		String bread;

		Sandwich(String ham, String cheese, String bread) {
			this.ham = ham;
			this.cheese = cheese;
			this.bread = bread;
		}

		Sandwich(String cheese, String bread) {
			this.cheese = cheese;
			this.bread = bread;
		}

	}

	public static void main(String[] args) {

		Sandwich sw1 = new Sandwich("Black Forest Ham", "Swiss Cheese", "White Bread");

		Sandwich sw2 = new Sandwich("Cheddar Cheese", "Wheat Bread");

		System.out.println(sw1.ham + ", " + sw1.cheese + ", " + sw1.bread);
		System.out.println(sw2.cheese + ", " + sw1.bread);

	}

}
