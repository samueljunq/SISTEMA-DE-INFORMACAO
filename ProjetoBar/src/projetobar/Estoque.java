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
public class Estoque {
      private String nomeProduto, categoria;
        public double quantidade, precoProduto;

        public String getNomeProduto() {
        return nomeProduto;
    }

        public void setNomeProduto (String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

        public String getCategoria() {
        return categoria;
    }

        public void setCategoria(String categoria){
        this.categoria = categoria;
    }

        public double getQuantidade() {
        return quantidade;
    }

        public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

        public double getPrecoProduto() {
        return precoProduto;
    }

        public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
        void mostra(){
            System.out.println("Digite a categoria do [PRODUTO] a ser adicionado:"+getCategoria());
            System.out.println("Digite o nome do [PRODUTO]:"+getNomeProduto());
            System.out.println("Digite a quantidade do [PRODUTO] a ser adicionado:"+getQuantidade());
            System.out.println("Digite o preço do [PRODUTO]:"+getPrecoProduto());
    }
}
