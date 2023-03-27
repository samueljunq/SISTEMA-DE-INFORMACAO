/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto;

/**
 *
 * @author 15449418620
 */
public class Carreta {
    private String cor;
    private String modeloCarreta;
    
    
    //construtor do método
    public Carreta(String cor, String modeloCarreta){
    this.cor = cor;
    this.modeloCarreta = modeloCarreta;
    }
    //acesso com (getters) nos atributos
    public String getCor(){
        return cor;
    }
    public String getModeloCarreta(){
        return modeloCarreta;
    }
    // setters para modificação aos atributos
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setModeloCarreta(String modeloCarreta){
        this.modeloCarreta = modeloCarreta;
    }
}
