import java.util.Random;

public class Metodos {

    private int[] numeros = new int[10000];


    public Metodos() {
    }

    public void inserir() {
        Random gerador = new Random();
        for (int i = 0; i < numeros.length; ++i)
            numeros[i] = gerador.nextInt(10000);
    }

    public void bubble() {
        int aux; 
        for (int i = 0; i < 10000; ++i) { 
            for (int j = i + 1; j < 10000; ++j) { 
                if (numeros[i] > numeros[j]) { 
                    aux = numeros[i]; 
                    numeros[i] = numeros[j]; 
                    numeros[j] = aux; 
                }
            }
        }
    }

    public void marge() {
        mergeSort(numeros, 0, numeros.length - 1);
        
    }

    private void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);
            intercalar(array, inicio, meio, fim);
        }
    }

    private void intercalar(int[] array, int inicio, int meio, int fim) {
        int tamanhoEsq = meio - inicio + 1;
        int tamanhoDir = fim - meio;
        int[] esquerda = new int[tamanhoEsq];
        int[] direita = new int[tamanhoDir];
        for (int i = 0; i < tamanhoEsq; i++)
            esquerda[i] = array[inicio + i];
        for (int j = 0; j < tamanhoDir; j++)
            direita[j] = array[meio + 1 + j];
        int i = 0, j = 0, k = inicio;
        while (i < tamanhoEsq && j < tamanhoDir) {
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }
        while (i < tamanhoEsq) {
            array[k] = esquerda[i];
            i++;
            k++;
        }
        while (j < tamanhoDir) {
            array[k] = direita[j];
            j++;
            k++;
        }
    }

    public void quick() {
        quickSort(numeros, 0, numeros.length - 1);
    }
    
    private void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(array, inicio, fim);
            quickSort(array, inicio, pivoIndex - 1); 
            quickSort(array, pivoIndex + 1, fim);    
        }
    }
    
    private int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }
}