package javasort;

public class Dados implements Comparable<Dados> {
    private String country, annualIncome, idh, continente;
    private int corruptionIndex;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCorruptionIndex() {
        return corruptionIndex;
    }

    public void setCorruptionIndex(int corruptionIndex) {
        this.corruptionIndex = corruptionIndex;
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getIDH() {
        return idh;
    }

    public void setIDH(String idh) {
        this.idh = idh;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    // Método para obter valores desviados (renda anual) formatados
    public double getValoresDesviados() {
        // Remova as vírgulas e converta para double
        return Double.parseDouble(annualIncome.replace(",", ""));
    }

    // Método para obter o IDH formatado como double
    public double getIDHFormatted() {
        // Certifique-se de substituir vírgulas por pontos para evitar problemas de formatação
        return Double.parseDouble(idh.replace(",", "."));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        
        if (o == null || getClass() != o.getClass()) 
            return false;
        
        Dados dados = (Dados) o;
        return country.equals(dados.country);
    }

    @Override
    public int compareTo(Dados o) {
        return this.getCountry().compareTo(o.getCountry());
    }
}
