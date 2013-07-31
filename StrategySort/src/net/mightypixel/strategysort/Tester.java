package net.mightypixel.strategysort;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library lib = new Library(new BubbleSort("Bubble Sort"));
		lib.sort();
		lib.setSort(new QuickSort("Quick Sort"));
		lib.sort();
		lib.setSort(new MergeSort("Merge Sort"));
		lib.sort();
	}

}
