package io.github.lovehq.sort;

import io.github.lovehq.common.Utils;

public class SelectionSort implements Sort {
    public <T extends Comparable<? super T>> void sort(T[] data) {
        for(int i = 0; i < data.length; i++){
            T min = data[i];
            int index = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[j].compareTo(min) < 0){
                    min = data[j];
                    index = j;
                }
            }
            if(index != i){
                Utils.swap(data, index, i);
            }
        }
    }
}
