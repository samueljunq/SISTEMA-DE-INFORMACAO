package implementacao_imposto;
import java.util.List;
import java.util.Map;

public class Produto {
	String nome;
    double precoCusto;
    List<String> impostos;
    double margemLucro;

    public Produto(String nome, double precoCusto, List<String> impostos, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.impostos = impostos;
        this.margemLucro = margemLucro;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public List<String> getImpostos() {
		return impostos;
	}

	public void setImpostos(List<String> impostos) {
		this.impostos = impostos;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public double calcularPrecoVenda(Map<String, Double> taxasImpostos) {
	    double totalImpostos = 0;
	    for (String imposto : impostos) {
	        if (taxasImpostos.containsKey(imposto)) {
	            totalImpostos += taxasImpostos.get(imposto);
	        }
	    }
	    
	    double precoVenda = precoCusto * (1 + totalImpostos); // Aplicar impostos sobre o preço de custo
	    double precoComMargem = precoVenda * (1 + margemLucro); // Aplicar margem de lucro sobre o preço com impostos
	    return precoComMargem;
	}
    
}
