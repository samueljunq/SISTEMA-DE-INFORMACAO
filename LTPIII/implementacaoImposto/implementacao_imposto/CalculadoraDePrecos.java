package implementacao_imposto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculadoraDePrecos {
    public static void main(String[] args) {
        Map<String, Double> taxasImpostos = new HashMap<>();
        taxasImpostos.put("ICMS", 0.07);
        taxasImpostos.put("Confins", 0.12);
        taxasImpostos.put("IPI", 0.08);
        taxasImpostos.put("ISS", 0.05);
        taxasImpostos.put("Cide", 0.10);
        taxasImpostos.put("CSLL", 0.04);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 7.00, List.of("Confins", "ICMS", "ISS"), 0.20));
        produtos.add(new Produto("Feijão", 7.00, List.of("Confins", "ICMS", "ISS"), 0.25));
        produtos.add(new Produto("Carne", 7.00, List.of("Confins", "ICMS", "IPI"), 0.35));
        produtos.add(new Produto("Cerveja", 7.00, List.of("Confins", "ICMS", "ISS", "IPI"), 0.30));
        produtos.add(new Produto("Gás", 7.00, List.of("Confins", "ICMS", "IPI"), 0.15));
        produtos.add(new Produto("Gasolina", 7.00, List.of("Confins", "ICMS", "Cide"), 0.15));

        System.out.println("Lista de Preços de Venda:");
        for (Produto produto : produtos) {
            double precoVenda = produto.calcularPrecoVenda(taxasImpostos);
            System.out.println(produto.getNome() + ": R$" + String.format("%.2f", precoVenda));
        }
    }
}
