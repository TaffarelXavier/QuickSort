/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class QuickSort {

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static int partition(int[] a, int left, int right, int pivotIndex) {
        swap(a, pivotIndex, right);
        int pos = left;//represents boundary between small and large elements
        for (int i = left; i < right; i++) {
            if (a[i] < a[right]) {
                swap(a, i, pos);
                pos++;
            }
        }
        swap(a, right, pos);
        return pos;
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pivotIndex = (left + right) / 2;
            int pos = partition(a, left, right, pivotIndex);
            quickSort(a, left, pos - 1);
            quickSort(a, pos + 1, right);
        }
    }

    public static void mostra_vetor(int[] vetor, int tamanho) {

        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

    }

    public static void main(String a[]) throws FileNotFoundException {

        while (true) {
            String nome_arquivo = "C:\\Users\\Taffarel\\Documents\\NetBeansProjects\\QuickSort\\src\\quicksort\\arquivo_decrescente.txt";
            Scanner scanner = new Scanner(new FileReader(nome_arquivo));
            int[] vetor = Converter.converter(scanner.nextLine().split(" "));

            int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            System.out.printf("Tamanho: %d\n", tamanho);
            //System.out.println("Antes");
            //mostra_vetor(vetor, tamanho);
            long tempoInicial = System.currentTimeMillis();
            quickSort(vetor, 0, tamanho);
            long tempoFinal = System.currentTimeMillis();
            //System.out.println("\nDepois");
            //mostra_vetor(vetor, tamanho);

            System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms\n");
            System.out.println("---------------------------------------------------------");
        }
    }
}
