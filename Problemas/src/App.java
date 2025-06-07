import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

import org.junit.Test;

public class App {

    public static void main(String[] args) throws Exception {

    }
    
    @Test
    public void BubbleSort() {
        long startTime = System.nanoTime();
        Metodos metodo = new Metodos();
        metodo.inserir();
        metodo.bubble();
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }

    @Test
    public void MergeSort() {
        long startTime = System.nanoTime();
        Metodos metodo = new Metodos();
        metodo.inserir();
        metodo.marge();
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }

    @Test
    public void QuickSort(){
        long startTime = System.nanoTime();
        Metodos metodo = new Metodos();
        metodo.inserir();
        metodo.quick();
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }
}
