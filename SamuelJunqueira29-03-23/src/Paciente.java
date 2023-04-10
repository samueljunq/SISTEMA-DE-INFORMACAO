/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15449418620
 */
public class Paciente {
    
    private String nomePaciente, motivoInternacao;
    private double valorDia, diasInternacao, valorInternacao, valorTotal, identificadorInternacao;
    private boolean statusEmpresa;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    public double getIdentificadorInternacao(){
        return identificadorInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }
    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
    public double getDiasInternacao() {
        return diasInternacao;
    }

    public void setDiasInternacao(double diasInternacao) {
        this.diasInternacao = diasInternacao;
    }
    public double valorInternacao() {
        return this.valorDia*diasInternacao;
    }
    public double valorTotal(){
        return this.valorInternacao+valorInternacao;
    }
    
    public void mostra(){
        System.out.println("Nome do paciente: "+nomePaciente);
        System.out.println("Digite o motivo da internação: Exemplo[Acidente, parada cardíaca...] "+motivoInternacao);
        System.out.println("Digite o valor do dia de internação: "+valorDia);
        System.out.println("Digite o total de dias internado: "+diasInternacao);
        System.out.println("O valor total da internação foi de: "+valorInternacao);
    }
}
