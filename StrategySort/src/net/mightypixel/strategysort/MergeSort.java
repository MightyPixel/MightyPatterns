package net.mightypixel.strategysort;

public class MergeSort implements ISort {

	private String name;
	private int[] array;
	private int[] helper;
	
	public MergeSort(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	private void merge(int low, int high) {
		
		if (low < high) {
			int mid = low + (high - low)/2;
			
			merge(low, mid);
			merge(mid + 1, high);
			
			merge(low, mid, high);
		}
	}
	
	private void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		int i = low, k = low;
		int j = mid + 1;
		
		
		while (i <= mid && j <= high ) {
			if (helper[i] <= helper[j]) {
				array[k] = helper[i];
				i++;
			} else {
				array[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			array[k] = helper[i];
			k++;
			i++;
		}
	}

	@Override
	public int[] sortCommand(int[] array) {
		this.array = array;
		this.helper = new int[this.array.length];
		
		merge(0, this.array.length - 1);
	
		return this.array;
	}

}
