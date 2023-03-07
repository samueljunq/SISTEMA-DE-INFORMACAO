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
public class Atividade_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contador = 0;
        int i = 0;

        while (i < palavra.length()) {
            if (palavra.substring(i, i+1).equals("a")) {
            contador++;
        }
            i++;
    }

    System.out.printf("A palavra %s possui %d letras 'a'.", palavra, contador);
}
}
