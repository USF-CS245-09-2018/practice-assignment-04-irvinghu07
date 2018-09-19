public abstract class AbstractSortingImpl implements SortingUtils, SortingAlgorithm {
    @Override
    public void swapValues(int[] arr, int firstIndex, int secondIndex) {
//        System.out.println(String.format("swaping %d(%d) with %d(%d)", firstIndex, arr[firstIndex], secondIndex, arr[secondIndex]));
        if (firstIndex != secondIndex) {
            int temp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = temp;
        }
    }

    @Override
    public int findMinAtIndex(int[] arr, int startIndex, int endIndex) {
//        System.out.print("looking at elements:");
//        for (int i = startIndex; i < endIndex; i++) {
//            System.out.print(String.format("%d ", arr[i]));
//        }
//        System.out.println(";");
        int minValue = arr[startIndex];
        int minValueIndex = startIndex;
        for (int i = startIndex + 1; i < endIndex; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minValueIndex = i;
            }
        }
//        System.out.println(String.format("find min at index: %d with value: %d", minValueIndex, arr[minValueIndex]));
        return minValueIndex;
    }

    @Override
    public int findMaxAtIndex(int[] arr, int startIndex, int endIndex) {
        int maxValue = arr[startIndex];
        int maxValueIndex = 0;
        for (int i = startIndex + 1; i < endIndex; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxValueIndex = i;
            }
        }
//        System.out.println(String.format("find max at index: %d with value: %d", maxValueIndex, arr[maxValueIndex]));
        return maxValueIndex;
    }
}
