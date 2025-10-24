public class SelectionSort {
    public void sort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            int minValueIndex = i;
            for(int j = 1+i; j < array.length; j++) {
                if (array[minValueIndex] > array[j]) {
                    minValueIndex = j;
                }
            }
            int aux = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = aux;
        }
    }
}
