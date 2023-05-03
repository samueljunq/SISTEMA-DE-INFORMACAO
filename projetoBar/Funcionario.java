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
public class Funcionario extends Pessoa{
      private String funcao;
        private double salario;

       
        public String getFuncao() {
        return funcao;
    }

        public void setFuncao(String funcao){
        this.funcao = funcao;
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
            System.out.println("O [RG] do funcionário é:"+getCpf());
            System.out.println("O salario do funcionário é:"+getSalario());
    }
}
