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
public class Atividade_13 {
    public static void main(String[] args){
        Scanner leia= new Scanner (System.in);
        double total;
        System.out.println ("Quantas pessoas compraram o pacote:");
        int pessoas = leitor.nextDouble();
        if(pessoas >=1 && pessoas <=4){
            total = pessoas * 160;
            System.out.println("O valor total do pacote é:"+total);
        }else if(pessoas >=5 && pessoas <=8 ){
            total = pessoas * 120;
            System.out.println("O valor total do pacote é:"+total);
            }
        else if(pessoas >=9){
            total = pessoas * 80;
            System.out.println("O valor total do pacote é:"+total);
            }
}
}