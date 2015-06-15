package io.github.lovehq.sort;

import java.lang.reflect.Array;

public class MergeSort implements Sort {

    public <T extends Comparable<? super T>> void sort(T[] data){
        sort(data, 0, data.length - 1);
    }

    private <T extends Comparable<? super T>> void sort(T[] data, int low, int high){
        if(high > low){
            int mid = low + (high - low) / 2;
            sort(data, low, mid);
            sort(data, mid + 1, high);
            merge(data, low, mid, high);
        }
    }

    private <T extends Comparable<? super T>> void merge(T[] data, int low, int mid, int high){
        T[] temp = (T[])Array.newInstance(data.getClass().getComponentType(), high-low+1);
        int left = low, right = mid + 1;
        int index = 0;
        while(left <= mid && right <= high){
            if(data[left].compareTo(data[right]) <= 0){
                temp[index] = data[left];
                left++;
            }else{
                temp[index] = data[right];
                right++;
            }
            index++;
        }
        while(left <= mid){
            temp[index++] = data[left++];
        }
        while(right <= high){
            temp[index++] = data[right++];
        }

        System.arraycopy(temp, 0, data, low, temp.length);
    }
}
