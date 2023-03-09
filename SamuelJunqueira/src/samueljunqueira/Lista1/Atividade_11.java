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
public class Atividade_11 {
    public static void main(String[] args){
        double cortesia;
        double totkm;
        double total;
        double diasrodado;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite quantos dias você utilizou o veiculo: ");
    double dia = scanner.nextInt();
    System.out.print("Digite quantos [KM] rodados com o veículo: ");
    double kmrod = scanner.nextInt();
    diasrodado = dia * 45.00;
    totkm = kmrod * 0.50;
    cortesia = 60;
    total = diasrodado + (totkm - cortesia);
    System.out.print("\nO valor total a pagar pela locação do veículo é [R$]: "+total);
    }
}
