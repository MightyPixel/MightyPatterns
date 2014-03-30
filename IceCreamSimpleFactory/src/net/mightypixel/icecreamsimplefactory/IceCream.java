package net.mightypixel.icecreamsimplefactory;

public abstract class IceCream {
	private String cone;
	private String base;
	private String topping;
	
	public String getCone() {
		return cone;
	}
	public void setCone(String cone) {
		this.cone = cone;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
		
	@Override
	public String toString() {
		return cone + base + topping;
	}
}
