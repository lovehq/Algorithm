package io.github.lovehq.sort;

import io.github.lovehq.common.Utils;

public class QuickSort implements Sort{

    public <T extends Comparable<? super T>> void sort(T[] data) {
        sort(data, 0, data.length - 1);
    }

    private <T extends Comparable<? super T>> void sort(T[] data, int low, int high) {
        if(low >= high){
            return;
        }
        int p = partition(data, low, high);
        sort(data, low, p - 1);
        sort(data, p + 1, high);
    }
    private  <T extends Comparable<? super T>> int partition(T[] data, int low, int high){
        int left = low, right = high + 1;
        while(true){
            while(data[++left].compareTo(data[low]) < 0){
                if(left == high){
                    break;
                }
            }
            while(data[--right].compareTo(data[low]) > 0){
                if(right == low){
                    break;
                }
            }
            if(left >= right){
                break;
            }
            Utils.swap(data, left, right);
        }
        Utils.swap(data, low, right);
        return right;
    }
}
