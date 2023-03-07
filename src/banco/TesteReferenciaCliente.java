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
public class TesteReferenciaCliente {
    public static void main(String[] args){
        Conta cl = new Conta();
        Cliente clil = new Cliente();
        cl.objCliente = clil;
        cl.objCliente.nome = "Paola Dias";
        System.out.println("Nome: "+cl.objCliente.nome);
    }
}
