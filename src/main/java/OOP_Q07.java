
public class OOP_Q07 {

	/*
	 * 7. Write a program by using super keyword for variable,
	 * methods, and constructor.
	 */
	
	static class animal {
		public void noises() {
			System.out.println("Animal noises");
		}
	}

	static class hen extends animal {
		public void noises() {
			super.noises();
			System.out.println("bok bok!");
		}
	}

	public static void main(String[] args) {

		animal blueHen = new hen();
		blueHen.noises();

	}

}
