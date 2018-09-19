public class BubbleSort extends AbstractSortingImpl{
    @Override
    public void sort(int[] a) {
        int maxValueIndex;
        int replaceIndex = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            maxValueIndex = findMaxAtIndex(a, 0, replaceIndex + 1);
            swapValues(a, maxValueIndex, replaceIndex);
            replaceIndex--;
        }
    }
}
