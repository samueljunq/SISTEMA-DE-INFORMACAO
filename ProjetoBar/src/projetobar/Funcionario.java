/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobar;

/**
 *
 * @author samue
 */
    public class Funcionario {
        private String nome, funcao, rg;
        private double salario;

        public String getNome() {
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public String getFuncao() {
        return funcao;
    }

        public void setFuncao(String funcao){
        this.funcao = funcao;
    }

        public String getRg() {
        return rg;
    }

        public void setRg(String rg) {
        this.rg = rg;
    }

        public double getSalario() {
        return salario;
    }

        public void setSalario(double salario) {
        this.salario = salario;
    }
        void mostra(){
            System.out.println("O nome do funcionário é:"+getNome());
            System.out.println("A função do funcionário é:"+getFuncao());
            System.out.println("O [RG] do funcionário é:"+getRg());
            System.out.println("O salario do funcionário é:"+getSalario());
    }
}
