/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 15449418620
 */
public class Main {
    public static void printArray(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println("");
    }
    
    public static int menuEntrada() {
        int op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Gerar Dados");
        System.out.println("2 - Entrar com Dados");
        op = scanner.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tam;
        
        System.out.println("Tamanho do vetor: ");
        tam = scanner.nextInt();
        int[] array = new int[tam];
        
        int op = menuEntrada();
        
        switch(op){
            case 1:
                for(int i = 0; i < array.length - 1; i++) {
                    array[i] = rand.nextInt(100);
                }
                break;
            case 2:
                System.out.println("Dados vetor: ");
                for(int i = 0; i < array.length - 1; i++) {
                    array[i] = scanner.nextInt();
                }
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
        
        System.out.println("Vetor original: ");
        
        HeapSort.hSort(array);
        System.out.println("Vetor ordenado: ");
        printArray(array);
    }
}
