/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samueljunqueira.Lista1;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Atividade_17 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        for (int i = 0; i < numero; i++) {
        System.out.print( letra );
        }
    }
}
