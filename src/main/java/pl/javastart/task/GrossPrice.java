package pl.javastart.task;

public class GrossPrice {
    private Product product;
    private Category category;

    public GrossPrice(Product product) {
        this.product = product;
    }

    double canculateTheFinalPrice() {
        switch (product.getCategory().getValueOfVat()) {
            case 8:
                return product.getNetPrice() * 0.08 + product.getNetPrice();
            case 5:
                return product.getNetPrice() * 0.05 + product.getNetPrice();
            default:
                return product.getNetPrice() * 0.23 + product.getNetPrice();
        }
    }
}
