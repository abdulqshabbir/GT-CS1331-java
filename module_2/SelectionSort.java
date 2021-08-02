public class SelectionSort {
    public void selectionSort (int[] list) {
        for (int unsortedStart = 0; unsortedStart <= list.length - 2; unsortedStart++) {
            int minIndex = unsortedStart;
            for (int i = minIndex + 1; i <= list.length - 1; i++) {
                if (list[i] < list[minIndex]) {
                    minIndex = i;
                }
            }

            int smallest = list[minIndex];
            list[minIndex] = list[unsortedStart];
            list[unsortedStart] = smallest;
        }
    }
}
