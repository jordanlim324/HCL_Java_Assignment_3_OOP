
public class OOP_Q06 {

	/*
	 * 6. Write an interface and implementation class for it.
	 */

	static interface superhero {
		public void name();

		public void power();
	}

	static class DrStrange implements superhero {
		public void name() {
			System.out.println("My name is Doctor Strange.");
		}

		public void power() {
			System.out.println("I use magic.");
		}
	}

	public static void main(String[] args) {
		DrStrange StephenStrange = new DrStrange();
		StephenStrange.name();
		StephenStrange.power();

	}

}
