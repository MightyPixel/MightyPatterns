package net.mightypixel;

public class Tester {

	public static void main(String[] args) {
		
		Animal dogOne = new Dog();
		Animal dogTwo = new Dog();
		Animal noDog = new NullAnimal();
		
		for (Animal animal : new Animal[] {dogOne, dogTwo, noDog}) {
			System.out.print("Animal: ");
			animal.makeSound();
		}
		
	}

}
