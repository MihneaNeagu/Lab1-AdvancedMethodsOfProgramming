package mi.sorting;

public class QuickSort extends AbstractSorter{
    private int partition (int[] a, int start, int end)
    {
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            if (a[j] < pivot)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }
    private void quickS(int[] a,int start,int end){
        if (start < end)
        {
            int p = this.partition(a, start, end);
            quickS(a, start, p - 1);
            quickS(a, p + 1, end);
        }
    }

    @Override
    public void sort(int[] a){
        this.quickS(a,0,a.length-1);
    }
}
