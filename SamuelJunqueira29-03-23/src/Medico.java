/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15449418620
 */
public class Medico {
    private String nomeMedico;
    Medico(){
        
    }
    Medico(String nomeMedico){
        this();
        this.nomeMedico = nomeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }
 
    public void mostra(){
        System.out.println("Nome do Médico: "+nomeMedico);     
    }
}
