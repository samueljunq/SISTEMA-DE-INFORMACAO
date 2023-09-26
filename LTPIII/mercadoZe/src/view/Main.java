package view;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Invoice;
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Arroz", 20.0, 5));
        products.add(new Product("Feijão", 12.0, 9));
        Invoice invoice = new Invoice(products);
        System.out.println("*MERCADO DO ZÉ*");
        for (Product product : products) {
            System.out.println(product.getName() + "----" + product.getQuantity() + " UNIDADES----R$" + product.getPrice() + "----TOTAL:R$" + product.getTotal());
        }
        System.out.println("Valor total da venda: R$ " + invoice.getTotal());
  }
}