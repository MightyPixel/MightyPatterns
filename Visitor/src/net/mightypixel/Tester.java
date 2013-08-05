package net.mightypixel;

public class Tester {

	public static void main(String[] args) {

        CarElement car = new Car("Lambo");
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
        
        
		
	}

}
