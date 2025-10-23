//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Quick Sort:");
        double[] numeros = {8, 3, 1, 7, 0, 10, 2};
        QuickSort qs = new QuickSort(numeros);

        System.out.println("Antes: " + qs);
        qs.sort(0, numeros.length - 1);
        System.out.println("Depois: " + qs);
        // teste do heapSort
        System.out.println("\nHeap Sort:");
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Array original: " + Arrays.toString(arr));

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Array ordenado (Heap Sort): " + Arrays.toString(arr));

        int arr2[] = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        System.out.println("\nArray original 2: " + Arrays.toString(arr2));
        ob.sort(arr2);
        System.out.println("Array ordenado 2 (Heap Sort): " + Arrays.toString(arr2));
        // fim do teste da Heap
    }
}