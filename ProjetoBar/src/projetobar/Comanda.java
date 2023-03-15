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
public class Comanda {
    public class Estoque {
      private String nomeProduto;
        private double mesa, qtdProduto, total, comissao;
        public String getNomeProduto() {
        return nomeProduto;
    }

        public void setNomeProduto (String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

        public double getMesa() {
        return mesa;
    }

        public void setMesa(double mesa) {
        this.mesa = mesa;
    }
        public double getQtdProduto() {
        return qtdProduto;
    }

        public void setQtdProduto(double qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
        public double getTotal() {
        return total;
    }

        public void setTotal(double total) {
        this.total = total;
    }
        public double getComissao() {
        return comissao;
    }

        public void setComissao(double comissao){
        this.comissao = comissao;
    }
        void mostra(){
            System.out.println("Digite o nome do [PRODUTO]:"+getNomeProduto());
            System.out.println("Digite o nome da [MESA]:"+getMesa());
            System.out.println("Digite a quantidade do [PRODUTO]:"+getQtdProduto());
            System.out.println("Digite o preço do [PRODUTO]:"+getTotal());
            System.out.println("Digite o preço do [PRODUTO]:"+getComissao());
        }

    }
}