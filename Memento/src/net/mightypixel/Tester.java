package net.mightypixel;

public class Tester {

	public static void main(String[] args) {
		
		Caretaker caretaker = new Caretaker();
		
		PseudoRandomGenerator generator = new PseudoRandomGenerator();
		System.out.println(generator.generate());
		System.out.println(generator.generate());
		System.out.println(generator.generate());
		caretaker.addMemento(generator.saveToMemento());
		System.out.println(generator.generate());
		System.out.println(generator.generate());
		caretaker.addMemento(generator.saveToMemento());
		System.out.println(generator.generate());
		generator.restoreFromMemento(caretaker.restoreMemento(0));
		System.out.println(generator.generate());
		System.out.println(generator.generate());
		generator.restoreFromMemento(caretaker.restoreMemento(1));
		System.out.println(generator.generate());		
		
	}
	
}
