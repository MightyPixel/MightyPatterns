package net.mightypixel.strategysort;


public class QuickSort implements ISort {

	private String name;
	
	public QuickSort(String name) {
		this.setName(name);
	}
	
	private int[] array;
	
	void qsort(int from, int to) {
		int i = from, j = to;
		int mid = array[i + (j - i)/2];
		 
		while (i <= j) {
			while (array[i] < mid) {
				i ++;
			}
			 
			while (array[j] > mid) {
				j--;
			}
			 
			if (i<=j) { 
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp; 
				i++;
				j--;
			}
		 }
		 
		 if (from < j) {
			 qsort(from, j);
		 }
		 if (to > i) {
			 qsort(i, to);
		 }
	}
	
	@Override
	public int[] sortCommand(int[] array) {
		if (array == null || array.length == 0)
			return null;

		this.array = array;
		qsort(0, array.length - 1);
		 
		return this.array;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
