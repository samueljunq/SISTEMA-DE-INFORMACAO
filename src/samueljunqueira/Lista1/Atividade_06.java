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
public class Atividade_06 {
     public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double comprimento;
        double area;
        double largura;
        double perimetro;
        Scanner leia= new Scanner (System.in);
        System.out.println("Digite o comprimento:");
        comprimento = leitor.nextDouble();
        System.out.println("Digite a largura:");
        largura = leitor.nextDouble();
        area = comprimento * largura;
        perimetro = (comprimento*2)+(largura*2);
        System.out.println("A area é:"+area);
        System.out.println("O perimêtro é:"+perimetro);
        }
}
