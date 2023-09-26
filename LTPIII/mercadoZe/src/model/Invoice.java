package model;

import java.util.List;

public class Invoice {
    private List<Product> products;
    public Invoice(List<Product> products) {
        this.products = products;
    }
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotal();
        }
        return total;
    }
}