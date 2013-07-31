package net.mightypixel.strategysort;


public class Library {

	private ISort sort;
	private String name;
	
	public Library (ISort sort) {
		this.sort = sort;
		name = sort.getName();
	}
	
	public void setSort (ISort Sort) {
		sort = Sort;
		this.name = sort.getName();
	}
	
	public void sort() {
		int unsorted[] = {81, 66, 83, 17, 87, 74, 55, 27, 72, 88, 13, 63, 31, 31, 68, 48, 1, 74, 22, 70, 76, 55, 7, 62, 68, 90, 71, 49, 11, 7};
		int sorted[] = sort.sortCommand(unsorted);
		System.out.println(name);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + ", ");
		}
		System.out.println();
	}
}
