public class QuickSort {
    private double[] array;

    public QuickSort(double[] array) {
        this.array = array;
    }

    public void sort(int start, int end){
        if (start < end) {
            int posPivot = divideArray(array, start, end);
            sort(start, posPivot - 1);
            sort(posPivot + 1, end);
        }

    }

    public int divideArray(double[] array, int start, int end){

        double pivot = array[end];
        int index = start;
        for(int i = start; i< end; i++){
            if(array[i] < pivot){
                double store = array[i];
                array[i] = array[index];
                array[index] = store;

                index++;
            }
        }

        double store = array[index];
        array[index] = pivot;
        array[end] = store;

        return index;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


}
