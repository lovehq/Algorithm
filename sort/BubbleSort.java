package sort;

import common.CommonUtils;

public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

	public void sort(T[] data) {
		for(int i = 0; i < data.length; i++){
			for(int j = data.length - 1; j > i; j--){
				if(data[j - 1].compareTo(data[j]) > 0){
					CommonUtils.swap(data, j-1, j);
				}
			}
		}
	}

}
