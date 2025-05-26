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
    public void testeLinked() {
        LinkedList<Integer> lista = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            lista.add((int) (Math.random() * 101));
        }
        assertTrue(!lista.isEmpty());
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }

    @Test
    public void testeArray() {
        ArrayList<Integer> lista = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            lista.add((int) (Math.random() * 101));
        }
        assertTrue(!lista.isEmpty());
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }

    @Test
    public void testeArrayRemoverAleatorio() {
        ArrayList<Integer> lista = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            lista.add((int) (Math.random() * 101));
        }
        while (!lista.isEmpty()) {
            ListIterator<Integer> iter = lista.listIterator();
            while (iter.hasNext()) {
                if (iter.next().equals((int) (Math.random() * 101)))
                    iter.remove();
            }
        }
        assertTrue(lista.isEmpty());
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }

    @Test
    public void testeLinkedRemover() {
        LinkedList<Integer> lista = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            lista.add((int) (Math.random() * 101));
        }
        while (!lista.isEmpty()) {
            lista.remove();
        }
        assertTrue(lista.isEmpty());
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
    }

    @Test
    public void testeLinkedRemoverAleatorio() {
        LinkedList<Integer> lista = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            lista.add((int) (Math.random() * 101));
        }
        while (!lista.isEmpty()) {
            ListIterator<Integer> iter = lista.listIterator();
            while (iter.hasNext()) {
                if (iter.next().equals((int) (Math.random() * 101)))
                    iter.remove();
            }
        }
        assertTrue(lista.isEmpty());
        Double endTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(endTime + " seconds");
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
