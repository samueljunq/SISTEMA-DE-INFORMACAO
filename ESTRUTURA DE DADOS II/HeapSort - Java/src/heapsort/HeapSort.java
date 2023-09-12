/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Scanner;

/**
 *
 * @author 15449418620
 */
public class HeapSort {
    public static void printHeap(int[] arr, int n, int i) {
        if (i < n) {
            // Imprime o nó atual
            System.out.print(arr[i]);

            // Calcula os índices dos filhos esquerdo e direito
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Imprime os filhos esquerdo e direito, se existirem
            if (left < n || right < n) {
                System.out.print(" (");
                if (left < n) {
                    printHeap(arr, n, left);
                }
                System.out.print(", ");
                if (right < n) {
                    printHeap(arr, n, right);
                }
                System.out.print(")");
            }
        }
    }
    
    public static void printArray(int array[]) {
        System.out.println("");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println("");
    }
    
    public static void hSort(int array[]) {
        int arraySize = array.length;
        Scanner scanner = new Scanner(System.in);
        // Constrói o heap máximo
        for(int i = arraySize / 2 - 1; i >= 0; i--) {
            System.out.println("");
            printArray(array);
            System.out.println("");
            System.out.println("Construindo o heap máximo.");
            printHeap(array, arraySize, 0);
            scanner.nextLine();
            heapify(array, arraySize, i);
        }
        
        // Extrai elementos do heap, um por um
        for(int i = arraySize - 1; i >= 0; i--) {
            // Move o elemento atual para o final do array
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            System.out.println("");
            System.out.println("Extraindo elemento do heap");
            printHeap(array, i, 0);
            System.out.println("");
            printArray(array);
            scanner.nextLine();
            // Chama heapify no heap reduzido
            heapify(array, i, 0);
        }
    }
    
   private static void heapify(int array[], int heapSize, int rootIndex) {
       Scanner scanner = new Scanner(System.in);
       int largest = rootIndex; // Inicializa o maior como o nó raiz
       int left = 2 * rootIndex + 1; // Índice do filho esquerdo
       int right = 2 * rootIndex + 2; // Índice do filho direito
       
       // Se o filho esquerdo for maior que o nó raiz
       if(left < heapSize && array[left] > array[largest]) {
           largest = left;
       }
       
       // Se o filho direito for maior que o nó raiz
       if(right < heapSize && array[right] > array[largest]) {
           largest = right;
       }
       
       // Se o maior não for o nó raiz
       if(largest != rootIndex) {
           System.out.println("");
           System.out.println("Corrigindo o heap.");
           int swap = array[rootIndex];
           array[rootIndex] = array[largest];
           array[largest] = swap;
           printHeap(array, heapSize, 0);
           // Recursivamente heapify na subárvore afetada
           heapify(array, heapSize, largest);
       }
   }  
}
