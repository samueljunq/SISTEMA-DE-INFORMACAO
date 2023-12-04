package javasort;

public class Dados implements Comparable<Dados> {
    private String ano, produtividadeLíquidaPorHoraTrabalhada, compensacaoMediaDeTrabalhadoresDeProduçãoEnaoSupervisores, compensacaoMedia, compensacaoMediana;
    private String compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getProdutividadeLíquidaPorHoraTrabalhada() {
        return produtividadeLíquidaPorHoraTrabalhada;
    }

    public void setProdutividadeLíquidaPorHoraTrabalhada(String produtividadeLíquidaPorHoraTrabalhada) {
        this.produtividadeLíquidaPorHoraTrabalhada = produtividadeLíquidaPorHoraTrabalhada;
    }

    public String getCompensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores() {
        String compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores = null;
        return compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores;
    }

    public void setCompensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores(String compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores) {
        this.compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores = compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores;
    }

    public String getCompensacaoMedia() {
        return compensacaoMedia;
    }

    public void setCompensacaoMedia(String compensacaoMedia) {
        this.compensacaoMedia = compensacaoMedia;
    }

    public String getCompensacaoMediana() {
        return compensacaoMediana;
    }

    public void setCompensacaoMediana(String compensacaoMediana) {
        this.compensacaoMediana = compensacaoMediana;
    }

    // Método para obter valores desviados (renda anual) formatados
    public double getValoresDesviados() {
        // Remova as vírgulas e converta para double
        return Double.parseDouble(produtividadeLíquidaPorHoraTrabalhada.replace(",", ""));
    }

    // Método para obter o IDH formatado como double
    public double getIDHFormatted() {
        // Certifique-se de substituir vírgulas por pontos para evitar problemas de formatação
        return Double.parseDouble(compensacaoMediaDeTrabalhadoresDeProducaoEnaoSupervisores.replace(",", "."));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Dados dados = (Dados) o;
        return ano.equals(dados.ano);
    }

    @Override
    public int compareTo(Dados o) {
        return this.getAno().compareTo(o.getAno());
    }
}
