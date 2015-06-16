package io.github.lovehq.sort;

public class ShellSortTest extends SortTest{
    @Override
    public Sort getInstance() {
        return new ShellSort();
    }
}
