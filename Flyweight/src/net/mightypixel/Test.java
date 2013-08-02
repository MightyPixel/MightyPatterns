package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FlyweightFactory factory = new FlyweightFactory();

		int oddNumber = 3;
		int evenNumber = 4;
		
		factory.getFlyweight("1").representNumber(oddNumber);
		factory.getFlyweight("2").representNumber(oddNumber);
		factory.getFlyweight("3").representNumber(evenNumber);
		factory.getFlyweight("4").representNumber(oddNumber);
		factory.getFlyweight("5").representNumber(oddNumber);
		factory.getFlyweight("6").representNumber(evenNumber);

		oddNumber++;
		evenNumber++;
		
		factory.getFlyweight("1").representNumber(oddNumber);
		factory.getFlyweight("2").representNumber(evenNumber);
		factory.getFlyweight("3").representNumber(evenNumber);
		factory.getFlyweight("4").representNumber(oddNumber);
		factory.getFlyweight("5").representNumber(evenNumber);
		factory.getFlyweight("6").representNumber(evenNumber);

		
	}

}
