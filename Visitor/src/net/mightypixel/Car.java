package net.mightypixel;

public class Car extends CarElement {
    CarElement[] elements;
    
	public Car(String name) {
		//create new Array of elements
		super(name);
        this.elements = new CarElement[] {
        					new Wheel("front left"), 
						    new Wheel("front right"),
						    new Wheel("back left") , 
						    new Wheel("back right"),
						    new Body("Body"),
						    new Engine("Engine") };
	}
	
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
