package io.github.lovehq.sort;

import io.github.lovehq.common.Utils;

public class ShellSort implements Sort {

    public <T extends Comparable<? super T>> void sort(T[] data) {
        int length = data.length;
        int gap = 1;
        while(gap < data.length / 3){
            gap = gap * 3 + 1;
        }
        while(gap >= 1){
            for(int i = gap; i < length; i+= gap){
                for(int j = i; j >= gap; j -= gap) {
                    if (data[j].compareTo(data[j - gap]) < 0) {
                        Utils.swap(data, j, j - gap);
                    }else{
                        break;
                    }
                }
            }
            gap /= 3;
        }
    }
}
