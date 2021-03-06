package io.github.lovehq.sort;

public class InsertionSort implements Sort{

	public <T extends Comparable<? super T>> void sort(T[] data) {
		if(data == null || data.length <= 1){
			return;
		}
		for(int i = 1; i < data.length; i++){
			T current = data[i];
			for(int j = i-1; j >= -1; j --){				
				if(j >= 0){
					if(data[j].compareTo(current) > 0){
						data[j+1] = data[j];
					}else{
						data[j+1] = current;
						break;
					}
				}else{
					data[j+1] = current;
				}
			}
		}
	}

}
