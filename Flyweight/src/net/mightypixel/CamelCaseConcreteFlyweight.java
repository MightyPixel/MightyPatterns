package net.mightypixel;

public class CamelCaseConcreteFlyweight implements Flyweight {
	
	private int numberOfRepresentedOddNumbers;
	
	public CamelCaseConcreteFlyweight() {
		numberOfRepresentedOddNumbers = 0;
	}

	@Override
	public void representNumber(int number) {
		if (number % 2 == 1)
			numberOfRepresentedOddNumbers ++;
			
		System.out.println("ThisIsCoolRepresentationOf " + new Integer(number).toString() + " total represented Numbers " + new Integer(numberOfRepresentedOddNumbers).toString());
	}

}
