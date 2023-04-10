/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15449418620
 */
public class Enfermeiro {
    private String nomeEnfermeiro;
    //construtor
    Enfermeiro(String nomeEnfermeiro){
        this.nomeEnfermeiro = nomeEnfermeiro;
    }  

    public Enfermeiro() {
    }
    
    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }
 
    public void mostra(){
        System.out.println("Nome do Enfermeiro responsavél: "+nomeEnfermeiro);  
    }

}
