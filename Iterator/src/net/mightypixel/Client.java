package net.mightypixel;

public class Client {

	public static void main(String[] args) {

		BookCollection myBooks = new BookCollection();
		IIterator iterator = myBooks.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println("The book is " + iterator.getNext());
		}
	}

}
