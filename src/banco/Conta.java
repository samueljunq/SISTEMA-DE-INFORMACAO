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
public class Conta
{   

    Cliente objCliente1 = new Cliente();
    Cliente objCliente2;
    private double saldo;
    private double limite;
    private int numero;
    
    Conta(){
        System.out.println("Construindo uma conta!");
    }
    Conta(double saldo){
        this();
        this.saldo = saldo;
    }
    Conta(double saldo, int numero){
        this(saldo); // invocar construtor anterior
    }
    public double getSaldo(){
        return this.saldo;
}
    
    public void deposita(double saldo){ // método
        this.saldo = this.saldo +saldo;
        System.out.println("Depósito realizado para: "+objCliente1.getNome());
    }
    
    public boolean saca(double saldo){ // método
        if(this.saldo>=saldo){
         this.saldo = this.saldo -saldo; 
            System.out.println("Saque realizado com sucesso");
         return true;
        }else{
            System.out.println("Saldo insuficiente");
         return false;   
        }
        
    }
    boolean transfere(Conta destino, double valor){
        if(this.saca(saldo) == true){
            destino.deposita(saldo);
            return true;
        }else{
            return false;
        }
    }
    void transfere(Conta outraConta, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}