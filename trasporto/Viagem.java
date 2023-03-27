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
public class Viagem {
    private String destino;
    private double valorKM;
    private double distancia;
    private double valorViagem;

    //construtor do método
    public Viagem(String destino, double valorKM, double distancia){
    
    this.destino = destino;
    this.valorKM = valorKM;
    this.distancia = distancia;
    calcularViagem();
    }
    //acesso com (getters) nos atributos
    public String getDestino(){
        return destino;
    }
    public double getValorKM(){
        return valorKM;
    }
    public double getDistancia(){
    return distancia;
    }
    // setters para modificação aos atributos
    public void setDestino(String destino){
        this.destino = destino;
    }
    public void setValorKM(double valorKM){
        this.valorKM = valorKM;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public double getValorViagem() {
        return valorViagem;
    }
    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }
    public void calcularViagem(){
        setValorViagem(valorKM * distancia);
    }
}
