/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samueljunqueira.Lista1;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Atividade_05 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double peso;
        double imc;
        double altura;
        Scanner leia= new Scanner (System.in);
        System.out.println("Favor digite sua altura:");
        altura = leitor.nextDouble();
        System.out.println("Favor difite o seu peso[KG]:");
        peso = leitor.nextDouble();
        imc = peso/ Math.pow(altura, 2);
        System.out.println("O seu IMC:"+imc);
        if(imc >=19.1 && imc <=25.8){
            System.out.println("Você está no peso ideal");
        }else{
            System.out.println("Você está obeso!");
            }
    }  
}
