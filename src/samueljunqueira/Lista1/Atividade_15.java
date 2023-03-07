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
public class Atividade_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroString = scanner.nextLine();

        boolean capicua = true;
        int tamanho = numeroString.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (numeroString.charAt(i) != numeroString.charAt(tamanho - i - 1)) {
                capicua = false;
                break;
            }
            }   
            if (capicua) {
            System.out.println("O número " + numeroString + " é capicua.");
            } else {
            System.out.println("O número " + numeroString + " não é capicua.");
        }
    }
}
