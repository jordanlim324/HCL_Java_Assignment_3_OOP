public class OOP_Q04 {

	/*
	 * 4. Write a program for method overriding example
	 */

	static class animal {
		public void move() {
			System.out.println("Moving");
		}
	}

	static class duck extends animal {
		@Override
		public void move() {
			System.out.println("I move by flying");
		}
	}

	public static void main(String[] args) {

		duck mallardDuck = new duck();
		mallardDuck.move();

	}
}