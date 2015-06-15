package io.github.lovehq.sort;

public class MergeSortTest  extends SortTest{
    @Override
    public Sort getInstance() {
        return new MergeSort();
    }
}
