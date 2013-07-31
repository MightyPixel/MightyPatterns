package net.mightypixel.strategysort;

public class BubbleSort implements ISort {
	private String name;
	
	public BubbleSort(String name) {
		this.name = name;
	}
	
	@Override
	public int[] sortCommand(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
		
		return array;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
