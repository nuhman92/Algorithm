package kuvaldis.algorithm.sort;

public class InsertionSortBenchmark extends SortBenchmark {

    @Override
    protected Class<? extends Sort> instance() {
        return InsertionSort.class;
    }
}