/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Programa {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new Conta();
        
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entrada.nextDouble());
       
        System.out.println("Digite um valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())==true){
            System.out.println("\nSaque realizado com sucesso");
        }
        System.out.println("Digite um valor para saque:");
        minhaConta.saca(entrada.nextDouble());
  
        System.out.println("Saldo minha conta: "+minhaConta.getSaldo());
    }
}
