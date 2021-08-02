public class InsertionSort {
   /*

        3 3 5 8 9

        i = 4
        temp = 2
        largestSorted = -1

        Assume array[0] is already sorted
        For each i from 1 to end:
            temp = array[i]
            largestSorted = i - 1
            while temp value is less than array[largestSorted] and largestSorted >= 0:
                array[largestSorted + 1] = array[largestSorted]
                largestSorted--

            array[largestSorted + 1] = temp
   */ 

    public static void main (String[] args) {
        InsertionSort a = new InsertionSort();
        int[] b = {-2, 3, 0, 10};
        for (int elem : b) {
            System.out.println(elem);
        }
        System.out.println("----------------");
        int[] sorted = a.sort(b);
        for (int elem : sorted) {
            System.out.println(elem);
        }
    }

    public int[] sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;

            while (temp < list[j] && j >= 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        return list;
    }
}
