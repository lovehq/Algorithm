package io.github.lovehq.sort;

public class QuickSortTest extends SortTest{
    @Override
    public Sort getInstance() {
        return new QuickSort();
    }
}
