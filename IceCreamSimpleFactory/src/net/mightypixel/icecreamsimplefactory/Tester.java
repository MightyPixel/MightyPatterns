/**
 * 
 */
package net.mightypixel.icecreamsimplefactory;

/**
 * @author pixel
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IceCream myIceCream = new IceCreamFactory().createIceCream(IceCreamType.chocolate);
		myIceCream.setTopping("Chocolate Chips");
		System.out.println(myIceCream);
	}

}
