package io.github.lovehq.sort;

public class SelectionSortTest extends SortTest {

    @Override
    public Sort getInstance() {
        return new SelectionSort();
    }
}
