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
public class Funcionario {
    private String nome, departamento, rg, entrada;
    private double salario;
    private boolean ativo = true;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    void mostra(){
        System.out.println("O nome do funcionario é:"+getNome());
        System.out.println("O departamento do funcionario é:"+getDepartamento());
        System.out.println("O [RG] do funcionario é:"+getRg());
        System.out.println("O salario do funcionario é:"+getSalario());
        System.out.println("O funcionario está ativo:"+isAtivo());
        System.out.println("A data de adimissão foi:"+getEntrada()); 
    }
    void bonifica(double aumento) {
        setSalario(getSalario() + aumento); 
    }
    void demite() {
        setAtivo(false);
    }
}
