package pl.javastart.task;

public class Product {
    private String name;
    private String category = "";
    private double netPrice;

    public Product(String name, String category, double netPrice) {
        this.name = name;
        this.category = category;
        this.netPrice = netPrice;
    }

    public Product(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getNetPrice() {
        return netPrice;
    }
}
