/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobar;

/**
 *
 * @author samue
 */
public class Conta {
      public String Cliente, Comanda;
        private double conta;
        
        public double getConta() {
        return conta;
    }

        public void setConta(double conta){
        this.conta = conta;
    }
        void mostra(){
            System.out.println("Digite o total da [COMANDA] a ser adicionado:"+getConta());
        }

}