/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class TesteFuncionario {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Funcionario objFuncionario = new Funcionario();
    System.out.println("Digite o nome do funcionario: ");
    objFuncionario.setNome( scanner.next());
    System.out.println("Digite o departamento onde ele trabalha: ");
    objFuncionario.setDepartamento( scanner.next());
    System.out.println("Digite o salário do funcionario: ");
    objFuncionario.setSalario( scanner.nextDouble());
    System.out.println("Digite o [RG] do funcionário: ");
    objFuncionario.setRg( scanner.next());
    System.out.println("Digite a data de entrada ao Banco: ");
    objFuncionario.setEntrada( scanner.next());
    
    objFuncionario.mostra();
    objFuncionario.bonifica(1000);
    objFuncionario.mostra();
    objFuncionario.demite();
    objFuncionario.mostra();
    }
}
