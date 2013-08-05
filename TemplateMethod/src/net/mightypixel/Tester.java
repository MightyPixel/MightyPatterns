package net.mightypixel;

public class Tester {

	public static void main(String[] args) {
		
		AbstractSort sortOne = new SortAscending();		
		AbstractSort sortTwo = new SortDescending();
		
		int array[] = {1,4,5,2,7};
		
		sortOne.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		sortTwo.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
