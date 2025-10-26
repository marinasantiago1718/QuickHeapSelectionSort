
import java.util.Arrays;
public class HeapSort {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, i, 0); 
        }
    }


    void maxHeapify(int[] arr, int heapSize, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {          
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            maxHeapify(arr, heapSize, largest);
        }
    }

    //Marina Santiago(2410499). Implementei o QuickSort e analisei o HeapSort.

    //Análise de Tempo
    //Metodo Sort
    //O primeiro for faz a construção do heap máximo, fazendo a chamada para cada nó interno, assim,
    // como depende do número de nós (n), têm-se que o custo da execução é O(n).

    // O segundo for ordena o heap que o primeiro construiu. Operando n vezes, ou seja, até a condição não ser atendida.
    //Assim, ele faz uma troca (O(1)) e chama o maxHeapify. Nesse método, ele percorre até chegar em uma folha,
    //ou seja, ele depende da altura da árvore. Isso equivale a dizer que h=log₂ n.
    //Como a ordenação executa n vezes, e a cada loop, o maxHeapify tem O(log₂ n), o Big O é O(n) * O(log₂ n) -> O(nlogn).

    //Análise de espaço
    //No método sort, as variáveis que são criadas tem O(1), pois a cada interação, o espaço alocado para elas é reutilizado.
    //Já no maxHeapify, como é recursivo, depende também da altura da árvore, sendo O(1) * o espaço da pilha de recursão, que é log₂ n.
    //Assim, como para o cálculo de S(n) é considerado o espaço simultâneo por chamada, somando o custo do maxHeapify e do sort,
    //fica O(logn).


    

    
}

