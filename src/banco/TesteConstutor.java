/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author samue
 */
public class TesteConstutor {
    public static void main(String[] args){
        Conta x = new Conta();
        Conta y = new Conta(6000);
        Conta z = new Conta(10000, 9173);
        System.out.println("Saldo da conta Z:"+z.getSaldo());
        System.out.println("Saldo da conta y:"+y.getSaldo());
    }
}