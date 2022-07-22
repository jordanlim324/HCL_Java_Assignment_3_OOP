
public class OOP_Q05 {

	/*
	 * 5. Write an abstract class and implement abstract methods in the subclass.
	 */

	abstract static class Smartphone {

		public void call() {
			System.out.println("I am taking a call.");
		}

		public abstract void playGame();

	}

	static class IPhone extends Smartphone {
		public void playGame() {
			System.out.println("I am playing a game.");
		}
	}

	public static void main(String[] args) {

		IPhone p = new IPhone();
		p.call();
		p.playGame();

	}

}
