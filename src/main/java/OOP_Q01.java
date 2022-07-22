
public class OOP_Q01 {

	/*
	 * 1. Write a program for Inheritance Example
	 */

	public static class Animal {

		String name;

	}

	public static class Dog extends Animal {
		public void bark() {
			System.out.println("Bark Bark");
		}

	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.bark();

	}

}
