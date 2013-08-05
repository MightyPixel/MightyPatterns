package net.mightypixel;

public abstract class CarElement {
	
    private String name;
    
    public CarElement(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
	
	public abstract void accept(CarElementVisitor visitor);
}
