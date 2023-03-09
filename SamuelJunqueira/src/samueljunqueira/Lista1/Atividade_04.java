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
public class Atividade_04 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor em [DOLAR $] a ser cambiado:");
        double dolar = input.nextDouble();
        double real = dolar * 5.10;
        System.out.println("O valor cambiado em [REAIS R$] é: " + real);
    }
}
