package io.github.lovehq.sort;

public interface Sort {

	<T extends Comparable<? super T>> void sort(T[] data) ;

}