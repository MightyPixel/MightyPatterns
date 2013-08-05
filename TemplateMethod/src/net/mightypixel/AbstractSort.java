package net.mightypixel;

public abstract class AbstractSort {
    public void sort(int v[])
    {
    	int n = v.length;
        for (int g = n / 2; g > 0; g /= 2)
          for (int i = g; i < n; i++)
            for (int j = i - g; j >= 0; j -= g)
              if (needSwap(v[j], v[j + g]))
              {
                  int tmp = v[j];
                  v[j] = v[j+g];
                  v[j+g] = tmp;
              }
    }
    
    protected abstract boolean needSwap(int a, int b);    
}
