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
public class Produtos {
        private String nomeProduto;
        private double precoProduto;
        private int quantidade;

    Produtos(Estoque estoque){
        this.addEstoque(estoque);
    }    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    void mostraProduto(){
        System.out.println("NOME DO PRODUTO: "+this.getNomeProduto());
        System.out.println("PREÇO DO PRODUTO: "+this.getPrecoProduto());
        System.out.println("QUANTIDADE DO PRODUTO : "+this.getQuantidade());
    }
    void addEstoque(Estoque estoque){
            estoque.listaEstoque.add(this);
        }
}
