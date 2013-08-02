package net.mightypixel;

public class CapsRepresentationFlyweight implements Flyweight {
	
	private int numberOfRepresentedEvenNumbers;

	public CapsRepresentationFlyweight() {
		numberOfRepresentedEvenNumbers = 0;
	}
	
	@Override
	public void representNumber(int number) {
		
		if (number % 2 == 1)
			numberOfRepresentedEvenNumbers ++;
		
		System.out.println("THIS IS COOL REPRESENTATION OF THE NUMBER " + number + " total represented Numbers " + new Integer(numberOfRepresentedEvenNumbers).toString());

	}

}
