

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15449418620
 */

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Internacao> listaInternacao = new ArrayList<>();
        
        Paciente p1 = new Paciente();
        System.out.println("*** Cadastro Paciente *** ");
        System.out.println("Informe o nome do paciente: ");
        p1.setNomePaciente(scan.nextLine());
        System.out.println("Motivo internação:");
        p1.setMotivoInternacao(scan.nextLine());
        
        Paciente p2 = new Paciente();
        p2.setNomePaciente("Jorge");
        p2.setMotivoInternacao("Dor de cabeça");
        
        Medico med1 = new Medico();
        System.out.println("\n*** Cadastro Medico ***");
        System.out.println("Informe o nome do médico: ");
        med1.setNomeMedico(scan.nextLine());
        
        Medico med2 = new Medico("Ricardo");
        
        Enfermeiro enf1 = new Enfermeiro();
         System.out.println("\n*** Cadastro Enfermeiro *** ");
        System.out.println("Informe o nome do enfermeiro: ");
        
        Enfermeiro enf2 = new Enfermeiro();
        enf2.setNomeEnfermeiro("João");
        
        Internacao internacaox = new Internacao(p2, enf2, med2);
        Internacao internacao1 = new Internacao(p1, enf1, med1);
        Internacao internacao2 = new Internacao(p1, enf2, med1);
        Internacao internacao3 = new Internacao(p1, enf1, med2);
        Internacao internacao4 = new Internacao(p2, enf2, med2);
        
        listaInternacao.add(internacao1);
        listaInternacao.add(internacao2);
        listaInternacao.add(internacao3);
        listaInternacao.add(internacao4);
        
        internacao1.mostraInternacoesPaciente(listaInternacao, p1);
        
    }
}
