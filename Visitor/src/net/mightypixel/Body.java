package net.mightypixel;

public class Body extends CarElement {

	public Body(String name) {
		super(name);
	}
	
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
