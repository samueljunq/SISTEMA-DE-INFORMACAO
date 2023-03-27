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
public class Caminhoneiro {
    private String nome;
    private double cnpj;
    private double cpf;
    private double salario; 
        
    //construtor do método
    public Caminhoneiro (String nome, double cnpj,double cpf,double salario){
    this.nome = nome;
    this.cnpj = cnpj;
    this.cpf = cpf;
    this.salario = salario;
    }
    //acesso com (getters) nos atributos
    public String getNome(){
        return nome;
    }
    public double getCnpj(){
        return cnpj;
    }
    public double getCpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }
    // setters para modificação aos atributos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCnpj(double cnpj){
        this.cnpj = cnpj;
    }
    public void setCpf(double cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
