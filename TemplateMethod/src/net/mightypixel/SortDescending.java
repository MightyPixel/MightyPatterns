package net.mightypixel;

public class SortDescending extends AbstractSort {

	@Override
	protected boolean needSwap(int a, int b) {
		return (a < b);
	}

}
