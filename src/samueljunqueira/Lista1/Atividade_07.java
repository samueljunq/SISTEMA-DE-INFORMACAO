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
public class Atividade_07 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
        double primeiro;
        double segundo;
        double terceiro;
        double quarto;
        double media;
        Scanner leia= new Scanner (System.in);
        System.out.println ("Digite sua nota do 1º Bimestre:");
        primeiro = leitor.nextDouble();
        System.out.println("Digite sua nota do 2º Bimestre:");
        segundo = leitor.nextDouble();
        System.out.println("Digite sua nota do 3º Bimestre:");
        terceiro = leitor.nextDouble();
        System.out.println("Digite sua nota do 4º Bimestre:");
        quarto = leitor.nextDouble();
        media = (primeiro+segundo+terceiro+quarto)/4;
        System.out.println("Sua media é:"+media);
        if(media >=0 && media <=3.49){
            System.out.println("Reprovado");
        }else if(media >=3.5 && media <= 6.49 ){
            System.out.println("Você está de recuperação!");
            }
        else{
            System.out.println("Você está aprovado!");
    } 
}
}