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




//Joao Miguel Cavalcante Drumond Silva(2410420)
//fiz o HEap Sort e esyou analizando o SelectionSort
//Análise de Tempo

//Metodo Sort
//A complexidade de tempo do Sort é Θ(N2) (N ao quadrado) devido aos dois loops aninhados que realizam um número quadrático de comparações em relação ao tamanho do array N.

//Análise de espaço
//As únicas variáveis alocadas dentro da função sort são de tamanho constante, i (int), minValueIndex (int), j (int), aux , portanto possui complexidade de  espaço (Θ(1))