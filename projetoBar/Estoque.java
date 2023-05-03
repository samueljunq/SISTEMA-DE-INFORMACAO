/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoBar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 15449418620
 */
public class Estoque {

        List<Produtos> listaEstoque = new ArrayList();

        void mostra(){
            for(Produtos p: listaEstoque){
                p.mostraProduto();
                System.out.println("-------------x-------------");
            }
    }
}
