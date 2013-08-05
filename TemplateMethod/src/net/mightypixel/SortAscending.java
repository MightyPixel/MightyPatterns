package net.mightypixel;

public class SortAscending extends AbstractSort {

	@Override
	protected boolean needSwap(int a, int b) {
		return (a > b);
	}

}
