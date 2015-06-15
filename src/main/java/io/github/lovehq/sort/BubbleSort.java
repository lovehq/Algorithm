package io.github.lovehq.sort;

import io.github.lovehq.common.Utils;

public class BubbleSort implements Sort {

	public <T extends Comparable<? super T>> void sort(T[] data) {
		for(int i = 0; i < data.length; i++){
			for(int j = data.length - 1; j > i; j--){
				if(data[j - 1].compareTo(data[j]) > 0){
					Utils.swap(data, j - 1, j);
				}
			}
		}
	}

}
