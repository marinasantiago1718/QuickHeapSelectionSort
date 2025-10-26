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
        for(int i = inicio; i<fim; i++){
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

/* Complexidade de Tempo
 * - Melhor caso: T(n) = 2T(n/2) + n => Θ(nlogn), segundo caso mestre.
 *  Ocorre quando o pivô é a mediana, dividindo o array igualmente.
 * 
 * - Pior caso: T(n) = T(n-1) + n => Θ(n²), ficaria uma árvore de altura n e cn = n, logo n².
 *  Árvore: n             -
 *        0   n-1         |
 *           0  n-2       | h = n
 *              0  ...    |
 *                   1    -
 *                   cn = n, então n*n => n².
 * 
 *  Ocorre quando o pivô é sempre o menor ou o maior elemento, neste caso seria o maior, em um array já ordenado.
 * 
 * - Caso médio: T(n) = T(n/10) + T(9n/10) + n => Θ(nlogn), ficaria uma árvore de altura log n e cn = n, logo nlogn.
 *  Árvore:    n                   - (9/10)^0 * n 
 *     n/10           9n/10        | (9/10)^1 * n
 * n/100  9n/100  9n/100  81n/100  | (9/10)^2 * n                  
 *     ...              ...        |     
 *      1                1         - h => (9/10)^h * n => h = log n
 *                                                              10/9
 *                                  cn = n, logo n*log n = Θ(nlogn)
 * 
 * Complexidade de Espaço
 *  A função que faz a partição do array, divideArray(), tem complexidade de espaço Θ(1), pois ela cria apenas varáveis locais.
 * 
 *  Método sort(), a complexidade de espaço depende da profundidade da recursão, que está relacionada com a altura da árvore
 * 
 *  - Pior caso: Θ(n), pois a pilha de chamadas cresce linearmente (árvore de altura n).
 * 
 *  - Melhor caso: Θ(log n), pois a árvore é balanceada (altura log n).
 * 
 *  - Caso médio: Θ(log n), pois a profundidade esperada da pilha é log n.
 * 
*/

