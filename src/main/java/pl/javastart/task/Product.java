package pl.javastart.task;

public class Product {
    private String name;
    private Category category;
    private double netPrice;

    public Product(String name, Category category, double netPrice) {
        this.name = name;
        this.category = category;
        this.netPrice = netPrice;
    }

    public Product(String name, double netPrice) {
        this.name = name;
        this.category = new Category("Brak kategorii");
        this.netPrice = netPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }
}
