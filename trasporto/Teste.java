/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto;

import java.util.Scanner;

/**
 *
 * @author 15449418620
 */
public class Teste {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do caminhoneiro:");
        String nome = scanner.nextLine();
        System.out.println("Digite o [CNPJ] do caminhoneiro:");
        double cnpj = scanner.nextDouble();
        System.out.println("Digite o [CPF] do caminhoneiro:");
        double cpf = scanner.nextDouble();
        System.out.println("Digite o salário do caminhoneiro:");
        double salario = scanner.nextDouble();
        Caminhoneiro objCaminhoneiro = new Caminhoneiro(nome, cnpj, cpf, salario);
        System.out.println("Digite o valor por [KM] percorrido:");
        double valorKM = scanner.nextDouble();
        System.out.println("Digite a distância [KM] percorrido:");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o destino:");
        String destino = scanner.nextLine();
        Viagem objViagem = new Viagem(destino, valorKM, distancia);
    }
}
