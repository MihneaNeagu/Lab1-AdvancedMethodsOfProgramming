package mi.model;

import mi.sorting.AbstractSorter;
import mi.sorting.BubbleSort;
import mi.sorting.QuickSort;
import mi.sorting.SortingStrategy;

import java.util.Arrays;

public class SortingTask extends Task{
    private int[] arr;
    private AbstractSorter sorter;

    public SortingTask(Long id, String desc, int[] arr, SortingStrategy strategy) {
        super(id, desc);
        if(strategy == SortingStrategy.BubbleSort)
            sorter = new BubbleSort();
        else sorter = new QuickSort();

        this.arr = arr;
    }

    @Override
    public void execute() {
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
