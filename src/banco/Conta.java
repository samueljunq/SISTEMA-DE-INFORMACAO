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

    Cliente objCliente;// atributos ou variáveis de instância
    double saldo;
    double limite;
    
    public void deposita(double saldo){ // método
        this.saldo = this.saldo +saldo;
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

    String getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

    class objCliente1 {

    static String nome;

    public objCliente1() {
    }
}
}

