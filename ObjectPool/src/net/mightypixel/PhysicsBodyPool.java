package net.mightypixel;

import java.util.ArrayList;
import java.util.List;

public class PhysicsBodyPool {

	private static PhysicsBodyPool pool;
	
	private static List<Body> bodies;
	private int maxPoolSize;
	
	private static int objectGlobalCount;
	
	private PhysicsBodyPool () {
		maxPoolSize = 3;
		bodies = new ArrayList<>();
	}
	
	public static PhysicsBodyPool getSharedInstance() {
		if (pool == null) {
			pool = new PhysicsBodyPool();
		}
		
		return pool;
	}
	
	public Body getBody() {
		Body body;
		if (bodies.size() < maxPoolSize) {
			body = new Body((new Integer(objectGlobalCount++)).toString());
		} else {
			body = bodies.get(0);
			bodies.remove(body);
		}

	
		return body;
	}
	
	public void releaseBody(Body body) {
		if (bodies.size() <= maxPoolSize) {
			bodies.add(body);			
		} else {
			body = null;
		}
	}
	
	public void setMaxPoolSize(int maxSize) {
		maxPoolSize = maxSize;
	}
}
