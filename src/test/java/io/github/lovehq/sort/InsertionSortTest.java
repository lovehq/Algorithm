package io.github.lovehq.sort;

public class InsertionSortTest extends SortTest{
    @Override
    public Sort getInstance() {
       return new InsertionSort();
    }
}
