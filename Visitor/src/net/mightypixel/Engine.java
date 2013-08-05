package net.mightypixel;

public class Engine extends CarElement {

	public Engine(String name) {
		super(name);
	}

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
