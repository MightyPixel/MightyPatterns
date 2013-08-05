package net.mightypixel;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements IContainer {

	private List<String> books;
	
	public BookCollection() {
		books = new ArrayList<String>();
		books.add("Hamlet");
		books.add("Lord of the Rings");
		books.add("The dangerous kingdom");
	}
	
	@Override
	public IIterator createIterator() {
		return new BookIterator();
	}
	

	public class BookIterator implements IIterator {
	
		private int currentItemIndex;
		
		@Override
		public boolean hasNext() {
			return currentItemIndex < books.size(); 
		}
	
		@Override
		public Object getNext() {
			if (hasNext())
				return books.get(currentItemIndex++);
			return null;
		}
	
	}


}
