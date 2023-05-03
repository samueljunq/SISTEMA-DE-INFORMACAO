/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoBar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 15449418620
 */
public class Comanda {
        Scanner scan = new Scanner(System.in);
        private double mesa, total;
        double valorPago = 0;
        List<Produtos> listaComanda = new ArrayList();
        Cliente cliente;
        Comanda(Cliente cliente){
            this.cliente = cliente;
        }
        
        public double getMesa() {
        return mesa;
    }

        public void setMesa(double mesa) {
        this.mesa = mesa;
    }
        public double getTotal() {
        return total;
    }
        public void setTotal(double total) {
        this.total = total;
    }
        void addProduto(Produtos p){
            this.listaComanda.add(p);
            
        }
        void mostra(){
            System.out.println("MESA: "+getMesa());
            System.out.println("CLIENTE: "+this.cliente);
            System.out.println("PRODUTOS COMANDA: ");
            for(Produtos p: listaComanda){
                p.mostraProduto();
                System.out.println("x-------x-------x");
            }
            System.out.println("TOTAL: "+getTotal());
            System.out.println("DIGITE O VALOR A SER PAGO: ");
            valorPago = scan.nextDouble();
            cliente.setDivida(cliente.getDivida() + (this.getTotal()- valorPago));
        }
       
}
