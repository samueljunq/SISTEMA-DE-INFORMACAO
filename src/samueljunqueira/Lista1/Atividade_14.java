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
public class Atividade_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();

        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.printf("A palavra %s possui %d letras 'a'.", palavra, contador);
    }
}
