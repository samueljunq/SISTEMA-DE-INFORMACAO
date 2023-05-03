/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoBar;

/**
 *
 * @author 15449418620
 */
public class Cliente extends Pessoa{
     private String endereco;
     private double divida;

    Cliente(){
        this.divida = 0;
        
    } 
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
    
}
