public class QuickSort {
    private double[] array;

    public QuickSort(double[] array) {
        this.array = array;
    }

    public void sort(int inicio, int fim){
        if (inicio < fim) {
            int posPivo = divideArray(array, inicio, fim);
            sort(inicio, posPivo - 1);
            sort(posPivo + 1, fim);
        }

    }

    public int divideArray(double[] array, int inicio, int fim){

        double pivo = array[fim];
        int indice = inicio;
        for(int i= inicio; i<fim; i++){
            if(array[i] < pivo){
                double store = array[i];
                array[i] = array[indice];
                array[indice] = store;

                indice++;
            }
        }

        double store = array[indice];
        array[indice] = pivo;
        array[fim] = store;

        return indice;

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
