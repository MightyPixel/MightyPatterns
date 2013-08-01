package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PhysicsBodyPool pool = PhysicsBodyPool.getSharedInstance();
		
		Body alice = pool.getBody();
		System.out.println(alice);
		Body bob = pool.getBody();
		System.out.println(bob);
		Body colin = pool.getBody();
		System.out.println(colin);
		Body duke = pool.getBody();
		System.out.println(duke);
		Body emma = pool.getBody();
		System.out.println(emma);
		pool.releaseBody(alice);
		pool.releaseBody(bob);
		pool.releaseBody(colin);
		Body fredy = pool.getBody();
		System.out.println(fredy);
	}

}
