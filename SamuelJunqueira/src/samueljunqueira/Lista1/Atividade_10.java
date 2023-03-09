/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samueljunqueira.Lista1;

import static javax.management.Query.gt;

/**
 *
 * @author samue
 */
public class Atividade_10 {
    public static void main (String args[ ] ){
    int x=4;
    System.out.println("O valor é:"+(( x&gt;4 ) ? 99.99 : 9));
}
}

// Resposta: Não vai compilar por as variáveis X e gt não foram introduzidas como variaveis globais, não foram introduziadas.