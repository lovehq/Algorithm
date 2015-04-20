package io.github.lovehq.sort;

public interface Sort<T extends Comparable<T>> {

	public void sort(T[] data);
	
}
