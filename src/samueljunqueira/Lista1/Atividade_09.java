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
public class Atividade_09 {
    public static void main(String[] args){
        double valorterreno;
        double valorconstrucao;
        double total;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a area total do Terreno (M²): ");
    int areaterreno = scanner.nextInt();
    System.out.print("Digite a area total de Construção (M²): ");
    int areaconstrucao = scanner.nextInt();
    valorterreno = areaterreno * 3.80;
    valorconstrucao = areaconstrucao * 5.00;
    total = valorterreno + valorconstrucao;
    System.out.print("\nO imposto pago pela areá total do Terreno é de: "+valorterreno);
        System.out.println("\n");
    System.out.print("O imposto pago pela areá total Construida do Terreno é de: "+valorconstrucao);
        System.out.println("\n");
    System.out.println("O número de azulejos necessários para cobrir a parede é: "+total);
    }
}
