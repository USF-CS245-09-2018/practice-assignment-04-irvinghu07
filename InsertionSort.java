public class InsertionSort extends AbstractSortingImpl implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        int minValueIndex;
        for (int i = 0; i < a.length; i++) {
            minValueIndex = findMinAtIndex(a, i, a.length);
            swapValues(a, i, minValueIndex);
        }
    }
}
