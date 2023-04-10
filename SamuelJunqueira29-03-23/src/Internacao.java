
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15449418620
 */
public class Internacao {
    private double identificadorInternacao, diasInternado, valorDia, valorTotalInternacao;
    private String motivoInternacao;
    private int codInternacao;
    private static int qtdInternacao;
    Paciente p;
    Enfermeiro e;
    Medico m;
    //construtor
    Internacao(Paciente p, Enfermeiro e, Medico m){
        // código auto incremento
        Internacao.qtdInternacao = Internacao.qtdInternacao + 1;
        this.codInternacao = qtdInternacao; 
        //
        this.p = p;
        this.e = e;
        this.m = m;
    }

    public int getCodInternacao() {
        return codInternacao;
    }

    public static int getQtdInternacao() {
        return qtdInternacao;
    }
    
    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }
    public double getIdentificadorInternacao() {
        return identificadorInternacao;
    }

    public void setIdentificadorInternacao(double identificadorInternacao) {
        this.identificadorInternacao = identificadorInternacao;
    }
    public void mostra(){
        System.out.println("Digite o [ID] da internação: "+identificadorInternacao);
        System.out.println("Digite o motivo da internação: "+motivoInternacao);     
    }
    void calculaValorTotalInternacao(){
        this.valorTotalInternacao = this.diasInternado * this.valorDia;
    }

    public double getValorTotalInternacao() {
        return valorTotalInternacao;
    }

    public void setValorTotalInternacao(double valorTotalInternacao) {
        this.valorTotalInternacao = valorTotalInternacao;
    }
    
    
    public void mostraInternacoesPaciente(ArrayList<Internacao> listaInternacao, Paciente paciente){
        int i = 0;
        double valor = 0;
        for(Internacao internacao :listaInternacao){
            if(paciente.getNomePaciente().equals(internacao.p.getNomePaciente())){
                i = 1;
                System.out.println("Internação " + internacao.getCodInternacao());
                System.out.println("Paciente: " + internacao.p.getNomePaciente());
                System.out.println("Médico: " + internacao.m.getNomeMedico());
                System.out.println("Enfermeiro: " + internacao.e.getNomeEnfermeiro());
                System.out.println("Enfermidade: " + internacao.getMotivoInternacao());
                System.out.println("Dias Internados: " + internacao.p.getDiasInternacao());
                System.out.println("Valor Diário: R$" + internacao.p.getValorDia());
                System.out.println("Valor Internação: R$" + internacao.getValorTotalInternacao());
                System.out.println("-------------------------------");
                valor = valor + internacao.valorTotalInternacao;
            }
        }
        if(i != 0)
            System.out.println("\nValor Total: R$" + valor);
    }
    
}