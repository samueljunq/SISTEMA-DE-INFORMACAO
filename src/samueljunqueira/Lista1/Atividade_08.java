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
public class Atividade_08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a altura da parede (HP): ");
    int hp = scanner.nextInt();
    System.out.print("Digite a largura da parede (LP): ");
    int lp = scanner.nextInt();
    System.out.print("Digite a altura do azulejo (HA): ");
    int ha = scanner.nextInt();
    System.out.print("Digite a largura do azulejo (LA): ");
    int la = scanner.nextInt();
    int numAzulejos = (hp * lp) / (ha * la);
    System.out.println("O número de azulejos necessários para cobrir a parede é: " + numAzulejos);
    }
}

